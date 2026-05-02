package com.klef.fsad.exam;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

@WebServlet("/viewbookings")

public class BookingServlet extends HttpServlet
{
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
                         throws ServletException, IOException
    {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory sf = cfg.buildSessionFactory();

        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();

        // Insert Records

        Booking b1 = new Booking(101,"Rahul",
                "2026-05-02","Confirmed",
                "Hyderabad",5000);

        Booking b2 = new Booking(102,"Kiran",
                "2026-05-03","Pending",
                "Vijayawada",3500);

        Booking b3 = new Booking(103,"Sneha",
                "2026-05-04","Cancelled",
                "Chennai",4200);

        session.save(b1);
        session.save(b2);
        session.save(b3);

        tx.commit();

        // HQL Query

        Query q = session.createQuery("from Booking");

        List<Booking> bookings = q.list();

        request.setAttribute("bookinglist", bookings);

        RequestDispatcher rd =
                request.getRequestDispatcher("display.jsp");

        rd.forward(request, response);

        session.close();
        sf.close();
    }
}