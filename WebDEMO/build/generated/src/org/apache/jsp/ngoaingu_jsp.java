package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ngoaingu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\n");
      out.write("<!--A Design by W3layouts\n");
      out.write("Author: W3layout\n");
      out.write("Author URL: http://w3layouts.com\n");
      out.write("License: Creative Commons Attribution 3.0 Unported\n");
      out.write("License URL: http://creativecommons.org/licenses/by/3.0/\n");
      out.write("-->\n");
      out.write("<!DOCTYPE HTML>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>The Educare Website Template | Home :: w3layouts</title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\n");
      out.write("            <link href='//fonts.googleapis.com/css?family=Pompiere' rel='stylesheet' type='text/css'>\n");
      out.write("                <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("                <!--slider-->\n");
      out.write("                <link href=\"css/flexslider.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("                <script src=\"js/jquery-1.7.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("                <script src=\"js/jquery.flexslider.js\" type=\"text/javascript\"></script>\n");
      out.write("                <script type=\"text/javascript\">\n");
      out.write("                    $(function () {\n");
      out.write("                        SyntaxHighlighter.all();\n");
      out.write("                    });\n");
      out.write("                    $(window).load(function () {\n");
      out.write("                        $('.flexslider').flexslider({\n");
      out.write("                            animation: \"slide\",\n");
      out.write("                            animationLoop: false,\n");
      out.write("                            itemWidth: 210,\n");
      out.write("                            itemMargin: 5,\n");
      out.write("                            minItems: 2,\n");
      out.write("                            maxItems: 4,\n");
      out.write("                            start: function (slider) {\n");
      out.write("                                $('body').removeClass('loading');\n");
      out.write("                            }\n");
      out.write("                        });\n");
      out.write("                    });\n");
      out.write("                </script>\n");
      out.write("                </head>\n");
      out.write("                <body>\n");
      out.write("                    <div class=\"h-bg\">\n");
      out.write("                        <div class=\"wrap\">\n");
      out.write("                            <div class=\"header\">\n");
      out.write("                                <div class=\"logo\">\n");
      out.write("                                    <a href=\"index.html\"><img src=\"images/logo.png\"> </a>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"header-right\">\n");
      out.write("                                    <ul class=\"nav\">\n");
      out.write("                                        <li class=\"active\"><a href=\"index.html\" title=\"Home\">Trang Chủ</a></li>\n");
      out.write("                                        <li><a href=\"vanhoc.jsp\">Văn Học</a></li>\n");
      out.write("                                        <li><a href=\"ngoaingu.jsp\">Ngoại Ngữ</a></li>\n");
      out.write("                                        <li><a href=\"tinhoc.jsp\">Tin Học</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"clear\"></div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"slider_bg\">\n");
      out.write("                        <div class=\"wrap\">\n");
      out.write("                            <section class=\"slider\">\n");
      out.write("                                <div class=\"flexslider carousel\">\n");
      out.write("                                    <ul class=\"slides\">\n");
      out.write("                                        <li>\n");
      out.write("                                            <img src=\"images/thumbnail-slider-1.jpg\" />\n");
      out.write("                                        </li>\n");
      out.write("                                        <li>\n");
      out.write("                                            <img src=\"images/thumbnail-slider-2.jpg\" />\n");
      out.write("                                        </li>\n");
      out.write("                                        <li>\n");
      out.write("                                            <img src=\"images/thumbnail-slider-3.jpg\" />\n");
      out.write("                                        </li>\n");
      out.write("                                        <li>\n");
      out.write("                                            <img src=\"images/thumbnail-slider-4.jpg\" />\n");
      out.write("                                        </li>\n");
      out.write("                                        <li>\n");
      out.write("                                            <img src=\"images/thumbnail-slider-5.jpg\" />\n");
      out.write("                                        </li>\n");
      out.write("                                        <li>\n");
      out.write("                                            <img src=\"images/thumbnail-slider-6.jpg\" />\n");
      out.write("                                        </li>\n");
      out.write("                                        <li>\n");
      out.write("                                            <img src=\"images/thumbnail-slider-8.jpg\" />\n");
      out.write("                                        </li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                            </section>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"cont_bg\">\n");
      out.write("                        <div class=\"wrap\">\n");
      out.write("                            <div class=\"content\">\n");
      out.write("                                <div class=\"main\">\n");
      out.write("                                    <h2>EDUCARE CHIA SẺ & KHÁM PHÁ</h2>\n");
      out.write("                                    <div class=\"text\">\n");
      out.write("                                        <div class=\"txt_img\">\n");
      out.write("                                            <a href=\"details.html\"><img src=\"images/pic1.jpg\"  alt=\"\" /></a> \n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"txt_para\">\n");
      out.write("                                            <p>Marketing and communication activities include all the activities to discover the need of the customers and find the ways to meet that demand effectively. From market, many researches set up on purpose looking for potential customers. Creating advertising messages that can connect with customers, designating the appropriate communication channels to convey the brand’s message… are all accountable for marketing.\n");
      out.write("                                                <br/>\n");
      out.write("                                                Marketing communication has evolved over the years, mainly due to changes coming from purchasers that affect businesses. Marketing concepts have been adapted more to suit current needs. Digital marketing has created great penetration for the e-commerce industry.\n");
      out.write("                                                <br/>\n");
      out.write("                                               \n");
      out.write("                                                With the origination of the key of marketing concepts, the focus on business shifted from hard sales to identify what the customer needs. Making exactly decisions to demand and develop the long-term with customer relationships. Long by serving their changing needs. Marketing concepts lead to the establishment of a separated marketing department within companies. Today, many companies have restructured them into marketing companies. Where each employee contributes the satisfaction to the customer, and regardless of whether or not they are marketers.\n");
      out.write("                                                <br>\n");
      out.write("                                                The latest marketing concepts are entirely dependent on the researches on the market that helps identify segments, scales, target markets and customer’s need… Then, using the correct marketing mix, marketing groups make decisions that lead to customer’s satisfaction\n");
      out.write("                                                <br/>\n");
      out.write("                                                The various forms of marketing will make the consumer market more attractive. If the economy is so strong, it will grow up under these powerful support tools.</p>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"txt_para1\">\n");
      out.write("                                        <p>But I must explain to you how all this mistaken idea of denouncing pleasure and praising pain was born and I will give and expound the actual teachings the master-builder of human happiness. No one rejects, dislikes, or avoids pleasure itself, because it is pleasure, but because those who do not know how to pursue pleasure rationally encounter consequences that are extremely painful. Nor again is there anyone who loves or pursues or desires to obtain pain of itself, because it is pain, but because occasionally circumstances occur in which toil and pain can procure him some great pleasure. To take a trivial example, which of us ever undertakes laborious physical exercise, except to obtain some advantage from it? </p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"btn\">\n");
      out.write("                                        <a href=\"details.html\">Read More <span>>></span></a>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"clear\"></div>\n");
      out.write("                                    <div class=\"menu1\">\n");
      out.write("                                        <ul class=\"list\">\n");
      out.write("                                            <li><img src=\"images/icon_1.png\" alt=\"\">\n");
      out.write("                                                    <p><strong>Penatibus parturnt montes</strong>Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi aliquip consequat Lorem ipsum dolor sitamet conset etuer amet adipinget praesent ....</p>\n");
      out.write("                                            </li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"menu1\">\n");
      out.write("                                        <ul class=\"list\">\n");
      out.write("                                            <li><img src=\"images/icon_2.png\" alt=\"\">\n");
      out.write("                                                    <p><strong>Penatibus parturnt montes</strong>Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi aliquip consequat Lorem ipsum dolor sitamet conset etuer amet adipinget praesent ....</p>\n");
      out.write("                                            </li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"sidebar\">\n");
      out.write("                                    <form action=\"/action_page.php\">\n");
      out.write("                                        <input type=\"text\" name=\"search\" placeholder=\"Search...\">\n");
      out.write("                                    </form>\n");
      out.write("                                    <div class=\"side_bar\">\n");
      out.write("                                        <h2>Tin Tức</h2>\n");
      out.write("                                        <p class=\"top\"><a href=\"\"><img src=\"images/art-pic1.jpg\" alt=\"\">Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi aliquip consequat.</a></p>\n");
      out.write("                                        <p class=\"top\"><a href=\"\"><img src=\"images/art-pic2.jpg\" alt=\"\">Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi aliquip consequat.</a></p>\n");
      out.write("                                        <p class=\"top\"><a href=\"\"><img src=\"images/art-pic3.jpg\" alt=\"\">Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi aliquip consequat.</a></p>\n");
      out.write("                                        <p class=\"top\"><a href=\"\"><img src=\"images/art-pic4.jpg\" alt=\"\">Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi aliquip consequat.</a></p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"side_bar1 testi-w3l\">\n");
      out.write("                                        <h2>Testimonials</h2>\n");
      out.write("                                        <p class=\"top top1\">But I must explain to you how all this mistaken idea of denouncing pleasure and praising pain was born and I will give you a complete account</p>\n");
      out.write("                                        <p class=\"side_bar1_bg\"></p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"clear\"></div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"menu2_bg\">\n");
      out.write("                        <div class=\"wrap\"> \n");
      out.write("                            <div class=\"menu2\">\n");
      out.write("                                <ul>\n");
      out.write("                                    <li><a href=\"index.jsp\">Trang Chủ</a></li>\n");
      out.write("                                    <li><a href=\"thongtin.jsp\">Thông Tin</a></li>\n");
      out.write("                                    <li><a href=\"giaiphap.jsp\">Giải Pháp</a></li>\n");
      out.write("                                    <li><a href=\"hotro.jsp\">Hỗ Trợ</a></li>\n");
      out.write("                                    <li><a href=\"guimail.jsp\">Gửi Mail</a></li>\n");
      out.write("                                    <li><a href=\"lienhe.jsp\">Liên Hệ</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"f_bg\">\n");
      out.write("                        <div class=\"wrap\">\n");
      out.write("                            <div class=\"footer\">\n");
      out.write("                                <div class=\"f_logo\">\n");
      out.write("                                    <a href=\"\"><img src=\"images/logo.png\" alt=\"\"></a>\n");
      out.write("                                    <div class=\"copy\">\n");
      out.write("                                        <p class=\"w3-link\">&copy; 2013 Educare. All rights reserved | Design by <a href=\"http://w3layouts.com/\">W3school</a></p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"f_grid\">\n");
      out.write("                                    <div class=\"social\">\n");
      out.write("                                        <ul class=\"follow_icon\">\n");
      out.write("                                            <li><a href=\"#\" style=\"opacity: 1;\">Get Updates Via</a></li>\n");
      out.write("                                            <li><a href=\"#\" style=\"opacity: 1;\"><img src=\"images/fb.png\" alt=\"\"></a></li>\n");
      out.write("                                            <li><a href=\"#\" style=\"opacity: 1;\"><img src=\"images/g+.png\" alt=\"\"></a></li>\n");
      out.write("                                            <li><a href=\"#\" style=\"opacity: 1;\"><img src=\"images/tw.png\" alt=\"\"></a></li>\n");
      out.write("                                            <li><a href=\"#\" style=\"opacity: 1;\"><img src=\"images/rss.png\" alt=\"\"></a></li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"f_grid1\">\n");
      out.write("                                    <div class=\"f_icon\">\n");
      out.write("                                        <img src=\"images/f_icon.png\" alt=\"\" />\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"f_address\">\n");
      out.write("                                        <p>500 Lorem Ipsum Dolor Sit,</p>\n");
      out.write("                                        <p>22-56-323 Lorem Ipsum Dolor Sit Sit Amet,</p>\n");
      out.write("                                        <p>Fax: (000) 000 00 00 0</p>\n");
      out.write("                                        <p>Email: <span><a href=\"mailto:@example.com\">info@mycompany.com</a></span></p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"clear\"></div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </body>\n");
      out.write("                </html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
