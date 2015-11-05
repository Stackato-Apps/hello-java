package org.cloudfoundry.samples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/plain");
		response.setStatus(200);
		PrintWriter writer = response.getWriter();

                // This is only needed because we want to print the IP
		String ssh_client_info = System.getenv("SSH_CONNECTION");
		String ip_addr = System.getenv("VCAP_APP_HOST");
		if (ssh_client_info != null && ip_addr.equals("0.0.0.0")) {
			int hubEnd = ssh_client_info.indexOf(" ");
			int portEnd = ssh_client_info.indexOf(" ", hubEnd + 1);
			int dockerIPAddressEnd = ssh_client_info.indexOf(" ", portEnd + 1);
			ip_addr = ssh_client_info.substring(portEnd + 1, dockerIPAddressEnd);
		}

		writer.println("gopaddle v " + ip_addr + ":" + System.getenv("VCAP_APP_PORT"));
		writer.close();
	}
}
