import { response } from "express";
import pool from "../db/dbConfig.js";
import Admin from '../model/Admin.js';
export const dashboardPageAction = (request,response,next)=>{
   response.render('dashboard.ejs');
}
export const singInPage = (request,response,next)=>{
    response.render("sign-in.ejs");
};

export const signInAction = (request,response,next)=>{
    let {email,password} = request.body;
    let admin = new Admin(null,email,password); 
    admin.authenticate()
    .then(result=>{
      if(result.length!=0){
        
        request.session.currentUserId = result[0].id;
        request.session.currentUserEmail = result[0].email;
        request.session.isLoggedIn = true;
        response.redirect("/admin/dashboard");
      } 
      else
        response.redirect("/admin/sign-in");  
    }).catch(err=>{
      console.log(err);
    })
}
export const dashboard=(request,response,next)=>{
  response.end("WELOCOMEEEEE..........................")
};