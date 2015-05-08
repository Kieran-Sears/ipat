/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com;

import Src.Artifact;
import Src.Controller;
import Src.Profile;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.google.gson.Gson;

/**
 *
 * @author kieran
 */
public class newGenRequest extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet newGenRequest</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet newGenRequest at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession(false);
        if (session == null) {
            System.out.println("Error, next generation button pressed before upload of input files.");
        } else {
            // get slider values :
            //+FreezeBGColour
            //+source
            //+ChangeGFContrast
            //+score
            //+ChangeFontSize
            //+FreezeFGFonts
            Gson gson = new Gson();
            ArrayList<ArrayList <String> > profileValues = new ArrayList<>();
           HashMap data  = gson.fromJson(request.getParameter("data"), HashMap.class);
            // cycle through keys converting them to strings
           Iterator it = data.keySet().iterator();
            while (it.hasNext()) {
               String key = (String) it.next();
                System.out.println(key);
                ArrayList<String> values  =  (ArrayList<String>) data.get(key);
                for (String value : values) {
                    System.out.println(value);
                }
            }
            
          
            
//            String[] score = (String[]) request.getParameterValues("data['score']");
//            String[] source =  (String[]) request.getParameterValues("data['source']");
//            String[] FreezeBGColour =  (String[]) request.getParameterValues("data['FreezeBGColour']");
//            String[] FreezeFGFonts =  (String[]) request.getParameterValues("data['FreezeFGFonts']");
//            String[] ChangeFontSize =  (String[]) request.getParameterValues("data['ChangeFontSize']");
//            String[] ChangeGFContrast =  (String[]) request.getParameterValues("data['ChangeGFContrast']");

//            for (int i = 0; i < source.length; i++) {
//                System.out.println( ChangeGFContrast[i] );
//                System.out.println( score[i] );
//                System.out.println( FreezeBGColour[i] );
//                System.out.println(  FreezeFGFonts[i] );
//                System.out.println( ChangeFontSize [i] );
//                System.out.println( source[i] );
//            }

//            // split slider values into key value pairs (name of profile / slider value) and assign to hashmap
//            HashMap<String, ArrayList<Integer>> sliderNames = new HashMap<>();
//            for (String urlWithValue : sliderValues) {
//                ArrayList<Integer> valuesList = new ArrayList<Integer>();
//                int value = Integer.parseInt(urlWithValue.substring(urlWithValue.indexOf("~") + 1));
//                String file = urlWithValue.substring(urlWithValue.lastIndexOf("/") + 1, urlWithValue.lastIndexOf("-"));
//                file = file.concat(".xml");
//                // TESTING : check to see if slider values have been updated and if correct number of them are present
//                //System.out.println("SLIDER VALUES : " + file + ": " + value);
//
//                // check for duplicates (one for each input file the user entered) and add their values to the valuesList 
//                if (sliderNames.containsKey(file)) {
//                    ArrayList<Integer> get = sliderNames.get(file);
//                    get.add(value);
//                    sliderNames.put(file, get);
//                    // else initilise another valuesList with the result profile's value and add as the value to the  result profiles name key in hashmap
//                } else {
//                    valuesList.add(value);
//                    sliderNames.put(file, valuesList);
//                }
//            }
//
//            // loop through sessions profiles and update their scores
//            // get the controllers currentGeneration of profiles
//            Controller controller = (Controller) session.getAttribute("Controller");
//            Profile[] profiles = controller.currentGenerationOfProfiles;
//
//            // Loop through current gerenation of profiles
//            for (Profile profile : profiles) {
//                Iterator<String> iterator = sliderNames.keySet().iterator();
//                System.out.println("ITERATING THROUGH CURRENT GEN PROFILES IN CONTROLLER : " + profile.getName());
//
//                //  for each profile cycle through the results
//                while (iterator.hasNext()) {
//                    String file = iterator.next();
//
//                    // if the result profile name is the same as the controllers profile name
//                    if (profile.getName().equalsIgnoreCase(file)) {
//
//                        // assign the average value of the valuesList to currentGenerationProfiles global score.
//                        ArrayList<Integer> get = sliderNames.get(file);
//                        int newScore = 0;
//                        for (Integer get1 : get) {
//                            newScore += get1;
//                        }
//                        newScore = newScore / get.size();
//                        profile.setGlobalScore(newScore);
//                        System.out.println("PROFILE MATCHED, " + file + " SCORES : " + sliderNames.get(file) + ",   AVERAGE SCORE :  " + newScore);
//                        break;
//                    }
//                }
//            }
//
//            controller.mainloop();
//            Artifact[] results = controller.processedArtifacts;
//          HashMap<String, ArrayList<String>> HM = new HashMap();
//        for (Artifact result : results) {
//            // cut out the generation (gen_y)
//            String name = result.getFilename().substring(result.getFilename().indexOf("-") + 1);
//            // split the result into its profile_x  and  fileName
//            String[] parts = name.split("-");
//            String fileName = parts[1];
//            String profileNum = parts[0].substring(parts[0].indexOf("_") + 1);
//
//            // if the hashmap is empty add the first element to it
//            if (HM.isEmpty()) {
//                System.out.println("CREATING RESULT [" + fileName + "] TO [ " + profileNum + " ] ");
//                ArrayList<String> imageList = new ArrayList<>();
//                imageList.add("Client%20Data/" + session.getId() + "/output/" + result.getFile().getName());
//                HM.put(profileNum, imageList);
//
//                // if the hashmap is not empty 
//            } else {
//                // check if hashmap already has the profile with a result in it and add the current result to this list
//                if (HM.containsKey(profileNum)) {
//                    System.out.println("ADDING RESULT [" + fileName + "] TO [ " + profileNum + " ] ");
//                    ArrayList<String> imageList = (ArrayList<String>) HM.get(profileNum);
//                    imageList.add("Client%20Data/" + session.getId() + "/output/" + result.getFile().getName());
//                    HM.put(profileNum, imageList);
//
//                    // if there are no matches, add a new hashmap element with the current result placed into a new list 
//                } else {
//                    System.out.println("CREATING RESULT [" + fileName + "] TO [ " + profileNum + " ] ");
//                    ArrayList<String> imageList = new ArrayList<>();
//                    imageList.add("Client%20Data/" + session.getId() + "/output/" + result.getFile().getName());
//                    HM.put(profileNum, imageList);
//                }
//            }
//        }
//
////             //TESTING : check for profile global scores have been reset to 5
////                Profile[] prof = controller.currentGenerationOfProfiles;
////                for (Profile prof1 : prof) {
////                    System.out.println(prof1.getName() + "   :  " + prof1.getGlobalScore());
////            }
//
//            String json = new Gson().toJson(HM);
//            response.setContentType("application/json");
//            response.setCharacterEncoding("UTF-8");
//            response.getWriter().write(json);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
