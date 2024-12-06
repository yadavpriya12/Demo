// for category

import express from "express";
import { addCategoryAction,addCategoryPage,viewCategoryAction} from "../controller/category.controller.js";
import { verify } from "../middleware/auth.js";
const router = express.Router();

router.get("/add-Category",verify,addCategoryPage);
router.post("/add-Category",verify,addCategoryAction);
router.get("/view-Category",viewCategoryAction);
// router.get("/edit-Category",verify,addCategoryPage);
// outer.post("/edit-Category", verify, editCategoryAction);
// router.get("/delete-Category/:id", verify, deleteCategory);

export default router;


