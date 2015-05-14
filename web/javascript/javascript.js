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
            xhr.onreadystatechange = function () {
                if (xhr.readyState === 4) {
                    var result = JSON.parse(xhr.responseText);

              

                    setTimeout(function () {
                        $('#tabs-byProfile').empty();
                        $('#tabs-byProfile').append(result.byProfileHTML);
                        $('#tabs-byImage').empty();
                        $('#tabs-byImage').append(result.byImageHTML);
                    }, 3000);
                }
            };
            xhr.send(formData);
            genCount.value = 0;
            genCount.value = parseInt(genCount.value) + 1;
            valid = false;
        }
    }, false);

//================================================
    // next Generation button pressed

    nextGen.addEventListener('click', function () {

        var data = {};
        var source = [];
        var score = [];
        var FreezeBGColour = [];
        var FreezeFGFonts = [];
        var ChangeFontSize = [];
        var ChangeGFContrast = [];

        for (var i = 0; i < populationSize; i++) {
            source.push(document.getElementById("frame_" + i).src);
            score.push(document.getElementById("score_" + i).value);
            ChangeFontSize.push(document.getElementById("ChangeFontSize_" + i).value);
            ChangeGFContrast.push(document.getElementById("ChangeGFContrast_" + i).value);
            FreezeBGColour.push($('#FreezeBGColour_' + i).is(':checked'));
            FreezeFGFonts.push($('#FreezeFGFonts_' + i).is(':checked'));
        }

        data['source'] = source;
        data['score'] = score;
        data['FreezeBGColour'] = FreezeBGColour;
        data['FreezeFGFonts'] = FreezeFGFonts;
        data['ChangeFontSize'] = ChangeFontSize;
        data['ChangeGFContrast'] = ChangeGFContrast;

        $('#tabs-byProfile').empty();
        $('#tabs-byProfile').html("<img src='" + image + "' />");

        $.ajax({
            url: "newGen",
            type: "POST",
            data: {data: JSON.stringify(data)},
            success: function (result) {
                $('#loading').html("<img src='" + image + "' />");
                setTimeout(function () {
                    $('#tabs-byProfile').empty();
                    $('#tabs-byProfile').append(result["byProfileHTML"]);
                    $('#tabs-byImage').empty();
                    $('#tabs-byImage').append(result["byImageHTML"]);
                }, 3000);
            }
        }, false);
        populationSize = 0;
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
            document.getElementById("score_" + i).value = 5;
        }
    }, false);

//================================================
// end of "on window load"
});

//================================================
// iframe icon clicked (preview tile)
function frameClick(id) {
    var num = id.split("_");
    var src = document.getElementById("frame_" + num[1]).src;
    document.getElementById("previewFrame").src = src;
}
//================================================
// changing the profile tab being displayed
function tabClicked(item) {
    $('[id^="byProfile_"]').hide();
    var num = item.slice(3);
    $('#byProfile_' + num).show();
}
//================================================
// changing the profile tab being displayed
$('ul.tabs').each(function(){
    // For each set of tabs, we want to keep track of
    // which tab is active and it's associated content
    var $active, $content, $links = $(this).find('a');

    // If the location.hash matches one of the links, use that as the active tab.
    // If no match is found, use the first link as the initial active tab.
    $active = $($links.filter('[href="'+location.hash+'"]')[0] || $links[0]);
    $active.addClass('active');

    $content = $($active[0].hash);

    // Hide the remaining content
    $links.not($active).each(function () {
      $(this.hash).hide();
    });

    // Bind the click event handler
    $(this).on('click', 'a', function(e){
      // Make the old tab inactive.
      $active.removeClass('active');
      $content.hide();

      // Update the variables with the new link and content
      $active = $(this);
      $content = $(this.hash);

      // Make the tab active.
      $active.addClass('active');
      $content.show();

      // Prevent the anchor's default click action
      e.preventDefault();
    });
  });
