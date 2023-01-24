<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html>
<head>
  <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <!-- color of address bar in mobile browser -->
  <meta name="theme-color" content="#2B2B35">
  <!-- favicon  -->
  <link rel="shortcut icon" href="img/thumbnail.ico" type="image/x-icon">
  <!-- bootstrap css -->
  <link rel="stylesheet" href="/Project/CSS/plugins/bootstrap.min.css">
  <!-- font awesome css -->
  <link rel="stylesheet" href="/Project/CSS/plugins/font-awesome.min.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css" integrity="sha512-MV7K8+y+gLIBoVD59lQIYicR65iaqukzvf/nwasF0nqhPay5w/9lJmVM2hMDcnK1OnMGCdVK+iQrJ7lzPJQd1w==" crossorigin="anonymous" referrerpolicy="no-referrer" />
  <!-- main css -->
  <link rel="stylesheet" href="/Project/CSS/style1.css">
  <title>Celebrity Page</title>
</head>
<body>
  <!-- app -->
  <div class="art-app">
    <!-- mobile top bar -->
    <div class="art-mobile-top-bar"></div>
    <!-- app wrapper -->
    <div class="art-app-wrapper">
      <!-- app container end -->
      <div class="art-app-container">
        <!-- content -->
        <div class="art-content">
          <!-- curtain -->
          <div class="art-curtain"></div>
          <!-- top background -->
          <div class="art-top-bg" style="background-image: url(/Project/CSS/img/bg.jpg)">
            <!-- overlay -->
            <div class="art-top-bg-overlay"></div>
            <!-- overlay end -->
          </div>
          <!-- top background end -->
          <!-- swup container -->
          <div class="transition-fade" id="swup">
            <!-- scroll frame -->
            <div id="scrollbar" class="art-scroll-frame">
              <!-- container -->
              <div class="container-fluid">
                <!-- row -->
                <div class="row p-60-0 p-lg-30-0 p-md-15-0 justify-content-center">
                  <!-- col -->
                  <div class="col-lg-11">
                    <!-- banner -->
                    <div class="art-a art-banner" style="background-image: url(/Project/CSS/img/bg.jpg)">
                      <!-- banner back -->
                      <div class="art-banner-back"></div>
                      <!-- banner dec -->
                      <div class="art-banner-dec"></div>
                      <!-- banner overlay -->
                      <div class="art-banner-overlay">
                        <!-- main title -->
                        <div class="art-banner-title">
                          <!-- title -->
                          <h1 class="mb-15"><c:out value="${celeb.getPrenom()}"/> <c:out value="${celeb.getNom()}" /><br><span class="text-info"> <c:out value="${celeb.getType()}"/></span></h1>
                          <!-- suptitle -->
                          <c:if test="${ml>tl }">
                          <div class="art-lg-text art-code mb-25"><i>Realisation populaire:</i><span style="text-transform:uppercase;"> <c:out value="${movie.getNom_movie()}" /></span><span class="txt-rotate" data-period="2000"
                              data-rotate='[ "web interfaces.", "ios and android applications.", "design mocups.", "automation tools." ]'></span></div>
                           </c:if>
                           <c:if test="${ml<tl }">
                          <div class="art-lg-text art-code mb-25"><i>Realisation populaire:</i><span style="text-transform:uppercase;"> <c:out value="${titre.getLabel_titre()}" /></span><span class="txt-rotate" data-period="2000"
                              data-rotate='[ "web interfaces.", "ios and android applications.", "design mocups.", "automation tools." ]'></span></div>
                           </c:if>
                          <div class="art-buttons-frame">
                            <!-- button -->
                            <a href="/Project/ServletCelebrity?action=findceleb&id=<c:out value="${celeb.getId()}"/>&t=2" class="art-btn art-btn-md"><span>Demander un contenu</span></a>
                          </div>
                        </div>
                        <!-- main title end -->
                        <!-- photo -->
                        <img src="<c:out value="${celeb.getPhoto()}" />" class="art-banner-photo" alt="Your Name" >
                      </div>
                      <!-- banner overlay end -->
                    </div>
                    <!-- banner end -->
                  </div>
                  <!-- col end -->
                </div>
                <!-- row end -->
              </div>
              <!-- container end -->
              <!-- container -->
              <div class="container-fluid">
                <!-- row -->
                <div class="row justify-content-center">
                  <!-- col -->
                  <div class="col-lg-12">
                    <!-- section title -->
                    <div class="art-section-title">
                      <!-- title frame -->
                      <div class="art-title-frame">
                        <!-- title -->
                        <h4 class="mt-2 mx-5">Articles associes</h4>
                      </div>
                      <!-- title frame end -->
                    </div>
                    <!-- section title end -->
                  </div>
                  <!-- col end -->
                  <!-- col -->
                  <div class="col-lg-2 col-md-3">
                    <!-- service -->
                    <div class="art-a art-service-icon-box ">
                      <!-- service content -->
                      <div class="art-service-ib-content1 text-center">
                          <!-- title -->
                          <h5 class="mb-15">Films et TV shows</h5>
                          <!-- text -->
                              <div class="mb-15 nombre-perform"><c:out value="${ml}"/></div>
                          <!-- button -->
                          <div class="art-buttons-frame"><a href="/contact.html" class="art-link art-color-link">Voir tout</a></div>
                      </div>
                      <!-- service content end -->
                    </div>
                    <!-- service end -->
                  </div>
                  <!-- col end -->
                  <!-- col -->
                  <div class="col-lg-2 col-md-3">
                    <!-- service -->
                    <div class="art-a art-service-icon-box ">
                      <!-- service content -->
                      <div class="art-service-ib-content1 text-center">
                          <!-- title -->
                          <h5 class="mb-15">Songs</h5>
                          <!-- text -->
                              <div class="mb-15 nombre-perform"><c:out value="${tl}"/></div> 
                          <!-- button -->
                          <div class="art-buttons-frame"><a href="/contact.html" class="art-link art-color-link">Voir tout</a></div>
                      </div>
                      <!-- service content end -->
                    </div>
                    <!-- service end -->
                  </div>
                  <!-- col end -->
                   <!-- col -->
                  <div class="col-lg-2 col-md-3">
                    <!-- service -->
                    <div class="art-a art-service-icon-box ">
                      <!-- service content -->
                      <div class="art-service-ib-content1 text-center">
                          <!-- title -->
                          <h5 class="mb-15">Films et TV shows</h5>
                          <!-- text -->
                              <div class="mb-15 nombre-perform"><c:out value="${ml}"/></div>
                          <!-- button -->
                          <div class="art-buttons-frame"><a href="/contact.html" class="art-link art-color-link">Voir tout</a></div>
                      </div>
                      <!-- service content end -->
                    </div>
                    <!-- service end -->
                  </div>
                  <!-- col end -->
                  <!-- col -->
                  <div class="col-lg-2 col-md-3">
                    <!-- service -->
                    <div class="art-a art-service-icon-box ">
                      <!-- service content -->
                      <div class="art-service-ib-content1 text-center">
                          <!-- title -->
                          <h5 class="mb-15">Songs</h5>
                          <!-- text -->
                              <div class="mb-15 nombre-perform"><c:out value="${tl}"/></div> 
                          <!-- button -->
                          <div class="art-buttons-frame"><a href="/contact.html" class="art-link art-color-link">Voir tout</a></div>
                      </div>
                      <!-- service content end -->
                    </div>
                    <!-- service end -->
                  </div>
                  <!-- col end -->
                </div>
                <!-- row end -->
              </div>
              <!-- container end -->

              <!-- container -->
              <div class="container-fluid">
                <!-- row -->
                <div class="row justify-content-center">
                  <!-- col -->
                  <div class="col-lg-12">
                    <!-- section title -->
                    <div class="art-section-title">
                      <!-- title frame -->
                      <div class="art-title-frame">
                        <!-- title -->
                        <h4 class="mt-2 mx-5 ">Celebrites associees</h4>
                      </div>
                      <!-- title frame end -->
                    </div>
                    <!-- section title end -->
                  </div>
                  <!-- col end -->
                  <!-- col -->
                  <c:if test="${celeb.getType()=='acteur' || celeb.getType()=='actrice' }">
	                  <c:forEach var="celeb1" items="${listcelebs}"  varStatus="boucle">
	                  <c:if test="${celeb1.getId()!=celeb.getId()&&(celeb1.getType()=='acteur' || celeb1.getType()=='actrice')}">
	                  <div class="col-lg-3 col-md-4">
	                    <!-- service -->
	                    <div class="art-a art-service-icon-box">
	                      <!-- service image -->
	                      <div class="frame-image-acteur text-center"><img src="<c:out value="${celeb1.getPhoto()}" />" alt="image" class=""></div>
	                      <!-- service content -->
	                      <div class="art-service-ib-content">
	                        <div class="frame37041">
	                          <!-- title -->
	                          <h5 class="mb-10"><c:out value="${celeb1.getPrenom()}"/><br><c:out value="${celeb1.getNom()}" /></h5>
	                          <!-- text -->
	                         <div class="mb-15"><c:out value="${celeb1.getType()}"/></div>
	                          <!-- button -->
	                          <div class="art-buttons-frame"><a href="/Project/ServletCelebrity?action=findceleb&id=<c:out value="${celeb1.getId()}"/>&t=1" class="art-link art-color-link"><span class="fa-regular fa-eye"></span></a></div>
	                       </div>
	                      </div>
	                      <!-- service content end -->
	                    </div>
	                    <!-- service end -->
	                  </div>
	                  <!-- col end -->
	                  </c:if>
	                  </c:forEach>
	             </c:if>
	              <c:if test="${celeb.getType()=='musicien' || celeb.getType()=='musicienne' }">
	                  <c:forEach var="celeb1" items="${listcelebs}"  varStatus="boucle">
	                  <c:if test="${celeb1.getId()!=celeb.getId()&&(celeb1.getType()=='musicien' || celeb1.getType()=='musicienne')}">
	                  <div class="col-lg-3 col-md-4">
	                    <!-- service -->
	                    <div class="art-a art-service-icon-box">
	                      <!-- service image -->
	                      <div class="frame-image-acteur text-center"><img src="<c:out value="${celeb1.getPhoto()}" />" alt="image" class=""></div>
	                      <!-- service content -->
	                      <div class="art-service-ib-content">
	                        <div class="frame37041">
	                          <!-- title -->
	                          <h5 class="mb-10"><c:out value="${celeb1.getPrenom()}"/><br><c:out value="${celeb1.getNom()}" /></h5>
	                          <!-- text -->
	                         <div class="mb-15"><c:out value="${celeb1.getType()}"/></div>
	                          <!-- button -->
	                          <div class="art-buttons-frame"><a href="/Project/ServletCelebrity?action=findceleb&id=<c:out value="${celeb1.getId()}"/>&t=1" class="art-link art-color-link"><span class="fa-regular fa-eye"></span></a></div>
	                       </div>
	                      </div>
	                      <!-- service content end -->
	                    </div>
	                    <!-- service end -->
	                  </div>
	                  <!-- col end -->
	                  </c:if>
	                  </c:forEach>
	             </c:if>
                </div>
                <!-- row end -->
              </div>
              <!-- container end -->

        <!-- menu bar -->
        
        <!-- menu bar end -->
      </div>
      <!-- app container end -->
    </div>
    <!-- app wrapper end -->
  </div>
  <!-- app end -->
  <!-- jquery js -->
  <script src="/Project/JS/plugins/jquery.min.js"></script>
  <!-- smooth scrollbar js -->
  <script src="/Project/JS/plugins/smooth-scrollbar.min.js"></script>
  <!-- overscroll js -->
  <script src="/Project/JS/plugins/overscroll.min.js"></script>
  <!-- main js -->
  <script src="/Project/JS/main.js"></script>
</body>
</html>