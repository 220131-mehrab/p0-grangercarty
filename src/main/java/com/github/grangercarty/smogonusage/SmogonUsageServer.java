package com.github.grangercarty.smogonusage;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class SmogonUsageServer extends HttpServlet {
    SmogonUsageService smoUsageService;

    public SmogonUsageServer(SmogonUsageService smoUsageService) {
        this.smoUsageService = smoUsageService;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    public void run() {
    }
}
