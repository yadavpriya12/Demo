import pool from "../db/dbConfig.js";
export default class Category {
    constructor(id, title) {
        this.id = id;
        this.title = title;
    }

    getAllCategory() {
        return new Promise((resolve, reject) => {
            pool.getConnection((err, con) => {
                if (!err) {
                    let sql = "SELECT * FROM  categories";
                    con.query(sql, (err, result) => {
                        con.release();
                        if (!err) {
                            resolve(result);
                        } else {
                            reject(err);
                        }
                    });
                } else {
                    reject(err);
                }
            });
        });
    }

     addcategory() {
        return new Promise((resolve, reject) => {
            pool.getConnection((err, con) => {
                if (!err) {
                    let sql = 'INSERT INTO  categories (name) VALUES (?)';
                    con.query(sql, [this.title], (err, result) => {    con.release();
                        if (!err) {
                            resolve(result);
                        } else {
                            reject(err);
                        }
                    });
                } else {
                    reject(err);
                }
            });
        });
    }
}