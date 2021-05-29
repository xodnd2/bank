package bank.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bank.service.Service;

public class TransferController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String rId = request.getParameter("rId");
		int money = Integer.parseInt(request.getParameter("money"));
		
		String id = (String)request.getSession().getAttribute("id");
		
		int tMoney = Service.getInstance().transfer(id, rId, money);
		if(tMoney < 0)
			request.setAttribute("result", "Not enough Money");
		request.setAttribute("tMoney", tMoney);
		request.setAttribute("money", money);
		request.setAttribute("rId", rId);
		HttpUtil.forward(request, response, "/result/transferResult.jsp");
	}

}
