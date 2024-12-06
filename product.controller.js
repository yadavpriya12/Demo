import product from "../model/product.js";

//---------------------------------------------Product-------------------------------------------------
export const addProductPage = (request, response, next) => {
    response.render("add-products.ejs");
};

export const addProductAction = (request, response, next) => {
    console.log(request.body);
    let obj = new product(null, request.body.title, request.body.description, request.body.price, request.body.categoryId, request.body.imgUrl);
    obj.addProduct()
        .then((result) => {
            console.log(result);
            response.redirect("/product/view-product");
        })
        .catch((error) => {
            console.log("Failed to add product:", error);
        });
};

export const viewproductAction = (request, response, next) => {
    let obj = new product();
    obj.getAllProducts()
        .then((result) => {
            response.render("view-products.ejs", { products: result });
        })
        .catch((error) => {
            console.log("Failed to fetch products:", error);
        });
};

export const editProductAction = (request, response, next) => {
    let { id, title, description, price, categoryId, imageUrl } = request.body;
    let p = new product(id, title, description, price, categoryId, imageUrl);
    p.update()
        .then((result) => {
            response.redirect("/product/view-product");
        })
        .catch((err) => {
            console.log("Failed to update product:", err);
        });
};

export const editProductPage = async (request, response, next) => {
    try {
        let productId = request.params.id;
        let obj = new product();
        let result = await obj.getProductById(productId);
        response.render("edit-products.ejs", { products: result[0] });
    } catch (err) {
        console.log("Failed to load edit page:", err);
    }
};

export const deleteProduct = (request, response, next) => {
    let productId = request.params.id;
    let obj = new product();
    obj.delete(productId)
        .then((result) => {
            response.redirect("/product/view-product");
        })
        .catch((err) => {
            console.log("Failed to delete product:", err);
        });
};

//----------------------------Caategory-------------------------
// export const editCategoryAction = async (request, response, next) => {
//     try {
//         let { id, name } = request.body; // Assuming you are editing category name
//         let categoryObj = new Category(id, name); // Ensure your Category model supports these parameters
//         let result = await categoryObj.update(); // Update the category in the database

//         if (result) {
//             response.redirect("/category/view-category"); // Redirect to a page showing categories
//         } else {
//             response.status(500).send("Failed to update category");
//         }
//     } catch (err) {
//         console.log("Failed to update Category:", err);
//         response.status(500).send("An error occurred while updating the category");
//     }
// };

// export const addCategoryPage = async (request, response, next) => {
//     try {
//         // You may need to pass an empty category object or data if it's for an "Add New" page
//         response.render("add-category.ejs"); // Ensure you have an `add-category.ejs` template
//     } catch (err) {
//         console.log("Failed to load category page:", err);
//         response.status(500).send("An error occurred while loading the add category page");
//     }
// };

// export const deleteCategory = async (request, response, next) => {
//     try {
//         let categoryId = request.params.id;
//         let categoryObj = new Category();
//         let result = await categoryObj.delete(categoryId);

//         if (result) {
//             response.redirect("/category/view-category"); // Redirect after deletion
//         } else {
//             response.status(500).send("Failed to delete category");
//         }
//     } catch (err) {
//         console.log("Failed to delete category:", err);
//         response.status(500).send("An error occurred while deleting the category");
//     }
// };

// // Optional: Add a function for viewing all categories if needed
// export const viewCategoryAction = async (request, response, next) => {
//     try {
//         let categoryObj = new Category();
//         let result = await categoryObj.getAllCategories(); // Ensure `getAllCategories()` is a method in the Category model
//         response.render("view-categories.ejs", { categories: result }); // Render a view with categories
//     } catch (err) {
//         console.log("Failed to fetch categories:", err);
//         response.status(500).send("An error occurred while fetching categories");
//     }
// };