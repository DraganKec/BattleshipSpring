package org.battleship.controller;

import org.battleship.service.BattleshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "BattleshipServlet")
public class BattleshipServlet extends HttpServlet {

    @Autowired
    BattleshipService battleshipService;

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this,
                config.getServletContext());
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        battleshipService.fillMatrix();
        battleshipService.addShips(4, 1);
        battleshipService.addShips(3, 2);
        battleshipService.addShips(2, 3);
        battleshipService.addShips(1, 4);

        request.setAttribute("battleshipMap", battleshipService.getBattleshipMap());

        RequestDispatcher view = request.getRequestDispatcher("index.jsp");
        view.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
