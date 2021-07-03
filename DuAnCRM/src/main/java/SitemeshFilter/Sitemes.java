package SitemeshFilter;

import javax.servlet.annotation.WebFilter;

import com.opensymphony.sitemesh.webapp.SiteMeshFilter;

@WebFilter(filterName = "sitemesh",urlPatterns = "/*")
public class Sitemes extends SiteMeshFilter {

}
