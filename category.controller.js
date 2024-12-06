import category from "../model/category.js"
//-------------------------------Category -------------------------

export const addCategoryPage = (request,response,next)=>{
    response.render("add-category.ejs");
}

export const addCategoryAction = (request, response, next) => {
    console.log(request.body);
    let obj = new category(null, request.body.title);
    obj.addcategory()
        .then((result) => {
            console.log(result);
            response.render("add-category.ejs");
            response.end("done");
        })
        .catch((error) => {                                       
            console.log("Failed...........");
            console.log(error);
            
        });
};


export const viewCategoryAction = (request, response, next) => {
    console.log(request.body);
    let obj = new category();
    obj.getAllCategory() 
        .then((result) => {
            console.log(result);
            response.render("view-category.ejs" , { categories : result});
            response.end("done");
        })
        .catch((error) => {                                       
            console.log("Failed...........");
            console.log(error);
            
        });
};


//`-----------------------Edit--------------------------


// export const editProductAction = (request,response,next)=>{
//     let {id,title,price} = request.body;
//     let p = new Product(id,title,price);
//     p.update()
//     .then(result=>{
//         response.redirect("/product/view-product");
//     }).catch(err=>{
//         console.log(err);
//     })
// }
// export const editProductPage = async (request,response,next)=>{
//    try{ 
//     let productId = request.params.productId;
//     let result  = await Product.getProductById(productId);
//     console.log(result[0]);
//     return response.render("edit-product.ejs",{product: result[0]});
//    }
//    catch(err){
//     console.log(err);
//    }
// }
