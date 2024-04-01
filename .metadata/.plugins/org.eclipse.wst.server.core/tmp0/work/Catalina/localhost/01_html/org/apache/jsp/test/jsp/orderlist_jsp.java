/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.86
 * Generated at: 2024-03-29 09:45:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.test.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class orderlist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\" />\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/header.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/orderlist.css\">\r\n");
      out.write("<script defer src=\"../js/header.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("	function purchase_go() {\r\n");
      out.write("		//	구매확정 누르면 해당 주문 상품이 구매리스트 테이블로 이동\r\n");
      out.write("		//	3일동안 안누르면 자동으로 이동\r\n");
      out.write("	}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<title>주문목록 페이지 (마이페이지 초기화면)</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<header>\r\n");
      out.write("		<div class=\"inner\">\r\n");
      out.write("			<div class=\"logo\">\r\n");
      out.write("				<h1>\r\n");
      out.write("					<a href=\"#\">로고</a>\r\n");
      out.write("				</h1>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("			<!-- 로그아웃 유틸 -->\r\n");
      out.write("			<div class=\"util logout_util\">\r\n");
      out.write("				<ul class=\"info\">\r\n");
      out.write("					<li><a href=\"#\">로그인</a></li>\r\n");
      out.write("					<li><a href=\"#\">회원가입</a></li>\r\n");
      out.write("					<li><a href=\"#\">고객센터</a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("			<form action=\"#\" class=\"h_search_form\" method=\"post\">\r\n");
      out.write("				<input type=\"text\" name=\"search\" id=\"search\" /> <input\r\n");
      out.write("					type=\"submit\" value=\"검색\" />\r\n");
      out.write("			</form>\r\n");
      out.write("\r\n");
      out.write("			<!-- 로그인 유틸 -->\r\n");
      out.write("			<div class=\"util login_util\">\r\n");
      out.write("				<ul class=\"info\">\r\n");
      out.write("					<li>이름</li>\r\n");
      out.write("					<li>보유 포인트 :</li>\r\n");
      out.write("					<li><a href=\"#\">로그아웃</a></li>\r\n");
      out.write("					<li><a href=\"#\">마이페이지</a></li>\r\n");
      out.write("					<li><a href=\"#\">장바구니</a></li>\r\n");
      out.write("					<li><a href=\"#\">고객센터</a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("			<div class=\"gnb_wrappr\">\r\n");
      out.write("				<ul class=\"gnb\">\r\n");
      out.write("					<li class=\"category\"><a id=\"category1\" data-category-id=\"1\"\r\n");
      out.write("						href=\"#\">카테고리1</a></li>\r\n");
      out.write("					<li class=\"category\"><a id=\"category2\" data-category-id=\"2\"\r\n");
      out.write("						href=\"#\">카테고리2</a></li>\r\n");
      out.write("					<li class=\"category\"><a id=\"category3\" data-category-id=\"3\"\r\n");
      out.write("						href=\"#\">카테고리3</a></li>\r\n");
      out.write("					<li class=\"category\"><a id=\"category4\" data-category-id=\"4\"\r\n");
      out.write("						href=\"#\">카테고리4</a></li>\r\n");
      out.write("					<li class=\"category\"><a id=\"category5\" data-category-id=\"5\"\r\n");
      out.write("						href=\"#\">카테고리5</a></li>\r\n");
      out.write("					<li class=\"category\"><a id=\"category6\" data-category-id=\"6\"\r\n");
      out.write("						href=\"#\">카테고리6</a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		<div class=\"category_detail_wrapper\">\r\n");
      out.write("			<div id=\"category_detail1\" class=\"category_detail\">\r\n");
      out.write("				<div class=\"c_details detail1\"></div>\r\n");
      out.write("				<div class=\"c_details detail2\"></div>\r\n");
      out.write("				<div class=\"c_details detail3\"></div>\r\n");
      out.write("				<div class=\"c_details detail4\"></div>\r\n");
      out.write("				<div class=\"c_details detail5\"></div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</header>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<section>\r\n");
      out.write("	\r\n");
      out.write("<!--===============================================================================  -->\r\n");
      out.write("\r\n");
      out.write("		<div class=\"div\">\r\n");
      out.write("			<br>\r\n");
      out.write("			<ul>\r\n");
      out.write("				<li><a href=\"#\">주문목록</a></li>\r\n");
      out.write("				<li><a href=\"#\">구매목록</a></li>\r\n");
      out.write("				<li><a href=\"#\">찜목록</a></li>\r\n");
      out.write("				<li><a href=\"#\">회원정보수정</a></li>\r\n");
      out.write("				<li><a href=\"#\">회원탈퇴</a></li>\r\n");
      out.write("			</ul>\r\n");
      out.write("	\r\n");
      out.write("			<h2>주문목록</h2>	\r\n");
      out.write("			\r\n");
      out.write("			<table class=\"table\">\r\n");
      out.write("				<thead>\r\n");
      out.write("	 				<tr>\r\n");
      out.write("		 				<th>주문 상품 정보</th>\r\n");
      out.write("		 				<th>주문 금액</th>\r\n");
      out.write("		 				<th>주문 수량</th>\r\n");
      out.write("		 				<th>주문 일자</th>\r\n");
      out.write("		 				<th>주문 상태</th>\r\n");
      out.write("	 				</tr>\r\n");
      out.write("	 			</thead>\r\n");
      out.write("	 			<tbody>\r\n");
      out.write("	 				<tr>\r\n");
      out.write("		 				<td><img src=\"../image/img01.jpg\" width=\"70px\"> 상품명, 색상, 사이즈</td>\r\n");
      out.write("		 				<td>11,000원</td>\r\n");
      out.write("		 				<td>1개</td>\r\n");
      out.write("		 				<td>2024-04-05</td>\r\n");
      out.write("		 				<td>운송장출력</td>\r\n");
      out.write("	 				</tr>\r\n");
      out.write("	 				<tr>\r\n");
      out.write("		 				<td><img src=\"../image/img02.jpg\" width=\"70px\"> 상품명, 색상, 사이즈</td>\r\n");
      out.write("		 				<td>22,000원</td>\r\n");
      out.write("		 				<td>2개</td>\r\n");
      out.write("		 				<td>2024-07-03</td>\r\n");
      out.write("		 				<td>배송중</td>\r\n");
      out.write("	 				</tr>\r\n");
      out.write("	 				<tr>\r\n");
      out.write("		 				<td><img src=\"../image/img03.jpg\" width=\"70px\"> 상품명, 색상, 사이즈</td>\r\n");
      out.write("		 				<td>33,000원</td>\r\n");
      out.write("		 				<td>3개</td>\r\n");
      out.write("		 				<td>2024-08-06</td>\r\n");
      out.write("		 				<td>배송완료<br><button onclick=\"purchase_go()\">구매확정</button></td>\r\n");
      out.write("	 				</tr>\r\n");
      out.write("	 			</tbody>\r\n");
      out.write("			</table>\r\n");
      out.write("						\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("<!--===============================================================================  -->\r\n");
      out.write("\r\n");
      out.write("		<footer>\r\n");
      out.write("			<div class=\"footer_info\">\r\n");
      out.write("				<h1>INFORMATION</h1>\r\n");
      out.write("				<br /> <a href=\"#\">개인정보취급방침</a> <a href=\"#\">이용약관</a> <a href=\"#\">이메일수집거부</a>\r\n");
      out.write("				<a href=\"#\">고객센터</a>\r\n");
      out.write("			</div>\r\n");
      out.write("			<hr />\r\n");
      out.write("			<div class=\"footer_cominfo\">\r\n");
      out.write("				<h1>회사</h1>\r\n");
      out.write("				<br />\r\n");
      out.write("				<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras\r\n");
      out.write("					laoreet arcu nec massa aliquam, at pharetra tellus ultricies.\r\n");
      out.write("					Vestibulum nec velit ante. Duis sed tortor elementum nisl luctus\r\n");
      out.write("					dapibus ut ut libero. Morbi vitae gravida nisi, eu mattis augue.\r\n");
      out.write("					Donec viverra vestibulum lorem eget lobortis. Praesent id odio in\r\n");
      out.write("					urna pulvinar varius. Vestibulum sollicitudin purus a velit\r\n");
      out.write("					posuere, nec congue sem sodales. Phasellus sed enim in urna\r\n");
      out.write("					hendrerit vestibulum. Etiam id eleifend tortor. Nulla lacinia lorem\r\n");
      out.write("					eget mi vehicula, vel fringilla nulla volutpat. Integer mi enim,\r\n");
      out.write("					sagittis eget dui nec, ullamcorper volutpat dolor.</p>\r\n");
      out.write("				<br />\r\n");
      out.write("				<p>저작권 ~~~</p>\r\n");
      out.write("			</div>\r\n");
      out.write("		</footer>\r\n");
      out.write("	</section>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
