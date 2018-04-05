package step15.ex02;

public interface Servlet {
    void init();
    void service();
    void destroty();
    String getServletInfo();
    String getServletConfig();
}
