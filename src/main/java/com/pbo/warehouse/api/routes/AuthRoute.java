package com.pbo.warehouse.api.routes;

import static spark.Spark.*;

import com.pbo.warehouse.api.controllers.AuthController;
import com.pbo.warehouse.api.dto.ResponseBodyDto;

public class AuthRoute {
    private static AuthController authController = new AuthController();

    public static void init() {
        post("/api/auth/login", (req, res) -> {
            ResponseBodyDto response = authController.login(req, res);

            res.type("application/json");
            res.status(response.getStatusCode());
            return response.toJson();
        });

        post("/api/auth/register", (req, res) -> {
            ResponseBodyDto response = authController.register(req, res);

            res.type("application/json");
            res.status(response.getStatusCode());
            return response.toJson();
        });
    }
}
