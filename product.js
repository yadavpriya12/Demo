import pool from "../db/dbConfig.js";

export default class product {
    constructor(id, name , description, price, categoryId, imageUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.categoryId = categoryId;
        this.imageUrl = imageUrl;
    }

    getAllProducts() {
        return new Promise((resolve, reject) => {
            pool.query("SELECT * FROM products", (err, result) => {
                if (err) return reject(err);
                resolve(result);
            });
        });
    }

    addProduct() {
        return new Promise((resolve, reject) => {
            const sql = "insert into products (name, description, price, category_id, imageUrl) VALUES (?, ?, ?, ?, ?)";
            pool.query(sql, [this.name, this.description, this.price, this.categoryId, this.imageUrl], (err, result) => {
                if (err) return reject(err);
                resolve(result);
            });
        });
    }
//-------------------------------Delete-----------------------------------
    delete(id) {
        return new Promise((resolve, reject) => {
            const sql = "DELETE FROM products WHERE id = ?";
            pool.query(sql, [id], (err, result) => {
                if (err) return reject(err);
                resolve(result);
            });
        });
    }

    getProductById(id) {
        return new Promise((resolve, reject) => {
            const sql = "SELECT * FROM products WHERE id = ?";
            pool.query(sql, [id], (err, result) => {
                if (err) return reject(err);
                resolve(result);
            });
        });
    }

    update() {
        return new Promise((resolve, reject) => {
            const sql = "UPDATE products SET name = ?, description = ?, price = ?, category_id = ?, imageUrl = ? WHERE id = ?";
            pool.query(sql, [this.name, this.description, this.price, this.categoryId, this.imageUrl, this.id], (err, result) => {
                if (err) return reject(err);
                resolve(result);
            });
        });
    }
}
