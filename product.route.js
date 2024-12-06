import express from "express";
import {
    addProductAction,
    addProductPage,
    viewproductAction,
    editProductAction,
    editProductPage,
    deleteProduct
} from "../controller/product.controller.js";
import { verify } from "../middleware/auth.js";

const router = express.Router();

// Product Routes
router.get("/add-product", verify, addProductPage);
router.post("/add-product", verify, addProductAction);
router.get("/view-product", verify, viewproductAction);
router.get("/edit-product/:id", verify, editProductPage);
router.post("/edit-product", verify, editProductAction);
router.get("/delete-product/:id", verify, deleteProduct);

export default router;