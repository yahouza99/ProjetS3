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
  <link rel="stylesheet" href="/Project/CSS/style.css">
  <title>Celebrities</title>
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
        <!-- info bar -->
        <div class="art-info-bar">
          <!-- menu bar frame -->
          <div class="art-info-bar-frame">
            <!-- info bar header -->
            <div class="art-info-bar-header">
              <!-- info bar button -->
              <a class="art-info-bar-btn" href="#.">
                <!-- icon -->
                <i class="fas fa-ellipsis-v"></i>
              </a>
              <!-- info bar button end -->
            </div>
            <!-- info bar header end -->
            <!-- info bar header -->
            <div class="art-header">
              <!-- avatar -->
              <div class="art-avatar">
                <a data-fancybox="avatar"  class="art-avatar-curtain">
                  <img src="${fan.getPhoto()}" alt="avatar">
                  <i class="fas fa-expand"></i>
                </a>
              </div>
              <!-- avatar end -->
              <!-- name -->
              <h5 class="art-name mb-10"><a href="/home.html">${fan.getPrenom()}</a></h5>
              <!-- post -->
              <div class="art-sm-text">${fan.getEmail()}</div>
            </div>
            <!-- info bar header end -->
            <!-- scroll frame -->
            <div id="scrollbar2" class="art-scroll-frame">
              <!-- info bar about -->
              <div class="art-table p-15-15">
                <!-- about text -->
                <ul>
                  <!-- country -->
                  <li>
                   <h4><a href="/Project/ServletCelebrity?action=celebinfan" style="color:white">Celebritees</a></h4> 
                  </li>
                  <li>
                    <h4><a href="/Project/ServletDemande?action=alldemande&m=1">Demandes</a><h4>
                  </li>
                  <li>
                    <h4><a href="#">Mes Favoris</a></h4>
                  </li>
                  <!-- city -->
                  <li>
                    <a href="/home.html">Muscic</a>
                  </li>
                  <li>
                    <a href="/Project/ServletCelebrity?action=findceleb&id=3&t=1">Films et Series</a>
                  </li>
                  <!-- age -->
                  
                </ul>
              </div>
              <!-- info bar about end -->
              <!-- divider -->
              <div class="art-ls-divider"></div>
              <!-- divider -->
              <!-- hard skills -->
              <div class="art-hard-skills p-30-15">
                <!-- skill -->
                <div class="art-hard-skills-item">
                  <div class="art-skill-heading">
                   
                  </div>
                  <!-- progressbar frame -->
                  <div class="art-line-progress">
                    <!-- progressbar -->
                    <div id="lineprog5"></div>
                  </div>
                  <!-- progressbar frame end -->
                </div>
                <!-- skill end -->
              </div>
              <!-- language skills end -->
            </div>
            <!-- scroll frame end -->
          </div>
          <!-- menu bar frame end -->
        </div>
        <!-- info bar end -->
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
                <div class="row p-60-0 p-lg-30-0 p-md-15-0 ">
                  <!-- col -->
                  <div class="col-lg-12 text-center">
                    <!-- banner -->
                    <div class="art-a art-banner1" style="background-color:rgba(91,192,222,0.1);">
                        <!-- main title -->
                          <!-- title -->
                          <span class="mb-15">Keep in touch<br>Celebrity Space APP !</span>
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
                <div class="row">
                  <!-- col -->
                  <div class="col-lg-12">
                    <!-- section title -->
                    <div class="art-section-title">
                      <!-- title frame -->
                      <div class="art-title-frame">
                        <!-- title -->
                        <h4 class="mt-4">Les celebritees</h4>
                      </div>
                      <!-- title frame end -->
                    </div>
                    <!-- section title end -->
                  </div>
                  <!-- col end -->
                  <!-- col -->
                   <c:forEach var="celeb" items="${listcelebs}"  varStatus="boucle">
                      
                         
                       <div class="col-lg-3 col-md-4">
                    <!-- service -->
                    <div class="art-a art-service-icon-box">
                      <!-- service image -->
                      <div class="frame-image-acteur text-center"><img src="<c:out value="${celeb.getPhoto()}" />" alt="image" class=""></div>
                      <!-- service content -->
                      <div class="art-service-ib-content">
                        <div class="frame37041">
                          <!-- title -->
                          <h5 class="mb-10"><c:out value="${celeb.getPrenom()}"/><br><c:out value="${celeb.getNom()}" /></h5>
                          <!-- text -->
                         <div class="mb-15"> <c:out value="${celeb.getType()}"/></div>
                          <!-- button -->
                          <div class="art-buttons-frame"><a href="/Project/ServletCelebrity?action=findceleb&id=<c:out value="${celeb.getId()}"/>&t=1" class="art-link art-color-link"><span class="fa-regular fa-eye"></span></a></div>
                       </div>
                      </div>
                      <!-- service content end -->
                    </div>
                    <!-- service end -->
                  </div>
                     
                   </c:forEach>
                   
                </div>
                <!-- row end -->
              </div>
              <!-- container end -->

              
            </div>
            <!-- scroll frame end -->
          </div>
          <!-- swup container end -->
        </div>
        <!-- content end -->
        <!-- menu bar -->
        <div class="art-menu-bar">
          <!-- menu bar frame -->
          <div class="art-menu-bar-frame">
            <!-- menu bar header -->
            <div class="art-menu-bar-header">
              <!-- menu bar button -->
              <a class="art-menu-bar-btn" href="#.">
                <!-- icon -->
                <span></span>
              </a>
              <!-- menu bar button end -->
            </div>
            <!-- menu bar header end -->
            <!-- current page title -->
            <div class="art-current-page"></div>
            <!-- current page title end -->
            <!-- scroll frame -->
            <div class="art-scroll-frame">
              <!-- menu -->
              <nav id="swupMenu">
                <!-- menu list -->
                <ul class="main-menu">
                  <!-- menu item -->
                  <li class="menu-item current-menu-item"><a href="/home.html">Accueil</a></li>
                  <!-- menu item -->
                  <li class="menu-item"><a href="/history.html">Celebritees</a></li>
                  <!-- menu item -->
                  <li class="menu-item"><a href="/contact.html">Article</a></li>
                  <!-- menu item -->
                  <li class="menu-item"><a href="onepage.html" target="_blank">Deconexion</a></li>
                </ul>
                <!-- menu list end -->
              </nav>
              <!-- menu end -->
            </div>
            <!-- scroll frame end -->
          </div>
          <!-- menu bar frame -->
        </div>
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