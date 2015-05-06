/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function () {
    var form = document.getElementById('fileUploadForm');
    var nextGen = document.getElementById("nextGeneration");
    var genCount = document.getElementById("generationCount");
    var abort = document.getElementById("abort");
    var reset = document.getElementById("resetScores");
    var image = "data/ajaxSpinner.gif";
    var populationSize;

//================================================

//================================================
// file upload detected

    form.addEventListener('change', function (event) {
        event.preventDefault();

        $('#tabs-byProfile').html("<img src='" + image + "' />");

        var files = document.getElementById('filesToUpload').files;
        var formData = new FormData();
        var valid = true;

        for (var i = 0; i < files.length; i++) {
            var file = files[i];
            if (!file.type.match('text/html')) {
                alert('Please only select files with .htm and .html extensions.');
                $('#tabs-byProfile').empty();
                $('#filelist').val('');
                $('#filesToUpload').replaceWith("<input class='filesToUpload' name='filesToUpload' id='filesToUpload' type='file' multiple />");
                genCount.value = 0;
                files = null;
                valid = false;
                break;
            }
            formData.append('filesToUpload', file, file.name);
            document.getElementById("filelist").value += file.name + "\n";
        }

        if (valid) {
            populationSize = 0;
            var xhr = new XMLHttpRequest();
            xhr.open('POST', 'FileUpload', true);
            xhr.onload = function () {
                if (xhr.status !== 200) {
                    alert('Server Error. We apologise for the inconvenience and will be up and running again shortly.');
                    $('#tabs-byProfile').empty();
                }
            };
            xhr.onreadystatechange = function ()
            {
                if (xhr.readyState === 4)
                {
                    var result = JSON.parse(xhr.responseText);
                    // get number of profiles in result
                    var size = 0, key;
                    for (key in result) {
                        if (result.hasOwnProperty(key))
                            size++;
                    }

                    // create the list for the profile tabs
                    var tabsContent = "<div id='profileTabs'><ul>";
                    for (var i = 0; i < size; i++) {
                        tabsContent += "<li><a href='#byProfile_" + (i) + "'>Profile " + (i) + "</a></li>";
                    }
                    tabsContent += " </ul></div>";
               
                    // populate div sections containing tables for each profile tab
                    for (var i = 0; i < size; i++) {
                        var cnt = i.toString();
                        var res = result[cnt];
                        var imageArray = res.toString().split(",");
                        var tableContent = "<div id='byProfile_" + [i] + "'><table border='1px'><tr>";
                        for (var j = 0; j < imageArray.length; j++) {
                            tableContent += "<tr><td class='cell'><iframe src='" + imageArray[j] + "' scrolling='yes' class='cellFrames' id='frame_" + populationSize + "' ></iframe><div id='overlay_" + populationSize + "' class='overlay' onclick='frameClick(this.id)'></div><input type='range' id ='slider_" + populationSize + "' min='0' max='10' value='5' step='1'  class='sliders'/></td></tr>";
                            populationSize += 1;
                        }
                        tableContent += "</table></div>";
                        $('#byProfile_' + i).append(tabsContent);
                    }
                    // populate the byProfiles tab 
                    setTimeout(function () {
                        alert("I'm here");
                        $('#tabs-byProfile').empty();
                        $('#tabs-byProfile').append(tabsContent);
                    }, 4000);
                }
            };
            xhr.send(formData);
            genCount.value = 0;
            genCount.value = parseInt(genCount.value) + 1;
            valid = false;
        }
    }, false);

//                        for (var j = 0; j < imageArray.length; j++) {
//                            if (i % 3 === 0) {
//                                tableContent += "<tr>";
//                            }
//                            tableContent += "<td class='cell'><iframe src='" + imageArray[j] + "' scrolling='yes' class='cellFrames' id='frame_" + populationSize + "' ></iframe><div id='overlay_" + populationSize + "' class='overlay' onclick='frameClick(this.id)'></div><input type='range' id ='slider_" + populationSize + "' min='0' max='10' value='5' step='1'  class='sliders'/></td>";
//                            if (i % 3 === 2) {
//                                tableContent += "</tr>";
//                            }
//                             populationSize += 1;
//                        }

//================================================
    // next Generation button pressed

    nextGen.addEventListener('click', function () {
        var data = [];
        for (var i = 0; i < populationSize; i++) {
            data.push(document.getElementById("frame_" + i).src + "~" + document.getElementById("slider_" + i).value);
        }

        $('#tabs-byProfile').empty();
        $('#tabs-byProfile').html("<img src='" + image + "' />");

        $.ajax({
            url: "newGen",
            type: "POST",
            data: {data: data},
            success: function (result) {

                $('#loading').html("<img src='" + image + "' />");

                populationSize = result.length;
                var content = "<table border='1px'><tr>";
                for (var i = 0; i < result.length; i++) {
                    if (i % 3 === 0) {
                        content += "<tr>";
                    }
                    content += "<td class='cell'><iframe src='" + result[i] + "' scrolling='yes' class='cellFrames' id='frame_" + i + "' ></iframe><div id='overlay_" + i + "' class='overlay' onclick='frameClick(this.id)'></div><input type='range' id ='slider_" + i + "' min='0' max='10' value='5' step='1'  class='sliders'/></td>";
                    if (i % 3 === 2) {
                        content += "</tr>";
                    }
                }
                content += "</tr></table>";

                setTimeout(function () {

                    $('#tabs-byProfile').empty();
                    $('#tabs-byProfile').append(content);
                }, 5000);

            }

        }, false);

        genCount.value = parseInt(genCount.value) + 1;
    });

//================================================
// abort button pressed
    abort.addEventListener('click', function () {
        $('#tabs-byProfile').empty();
        $('#filelist').val('');
        $('#filesToUpload').replaceWith("<input class='filesToUpload' name='filesToUpload' id='filesToUpload' type='file' multiple />");
        genCount.value = 0;
        $.ajax({
            url: "abort",
            type: "POST",
            success: function (result) {
                alert(result);
            }
        });
    }, false);

//================================================
// reset button pressed
    reset.addEventListener('click', function () {
        for (var i = 0; i < populationSize; i++) {
            document.getElementById("slider_" + i).value = 5;
        }
    }, false);


//================================================

    window.setInterval(function () {
        for (var i = 0; i < populationSize; i++) {
            var ttle = $('#frame_' + i).contents().find('title').text();
            if (ttle.indexOf("404") == -1) {
                $.get($('#frame_' + i).src, function (data) {
                    $('#frame_' + i).src = data;
                });
            }
        }
    }, 5000);

});

//================================================
// iframe icon clicked (preview tile)
function frameClick(id) {
    var num = id.split("_");
    var src = document.getElementById("frame_" + num[1]).src;
    document.getElementById("previewFrame").src = src;
}

