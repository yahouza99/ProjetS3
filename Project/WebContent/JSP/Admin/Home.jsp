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
  <title>Admin</title>
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
        <div class="art-info-bar ">
          <!-- menu bar frame -->
          <div class="art-info-bar-frame ">
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
            <div class="art-header ">
              <!-- avatar -->
              <div class="art-avatar ">
                <a data-fancybox="avatar" class="art-avatar-curtain">
                  <img src="/Project/CSS/img/amin.png" alt="avatar">
                  <i class="fas fa-expand"></i>
                </a>
              </div>
              <!-- avatar end -->
              <!-- name -->
              <h5 class="art-name mb-10">Administrateur</h5>
              <!-- post -->
              <div class="art-sm-text">${admin.getPrenom()} ${admin.getNom()} </div>
            </div>
            <!-- info bar header end -->
            <!-- scroll frame -->
            <div id="scrollbar2" class="art-scroll-frame">
              <!-- info bar about -->
              <!-- menu -->
              <nav id="swupMenu">
                <!-- menu list -->
                <ul class="main-menu" style="list-style-type: none; font-size: 20px;">
                  <!-- menu item -->
                  <li class="menu-item mb-1"><a href="/Project/ServletAdmin?action=home" style="color:white;"><i class="fa-solid fa-house"></i>  Home</a></li>
                  <!-- menu item -->
                  <li class="menu-item current-menu-item mb-1"><a href="/Project/ServletCelebrity?action=allceleb" ><i class="fa-regular fa-user"></i>   Celebritees</a></li>
                  <!-- menu item -->
                  <li class="menu-item   mb-1" ><a href="/Project/SevletFAN?action=allfan" ><i class="fa-solid fa-users"></i>  Fan</a></li>
                  <!-- menu item -->
                  <li class="menu-item mb-1"><a href="/Project/ServletArticle?action=allarticle"><i class="fa-solid fa-rectangle-list"></i>  Articles</a></li>
                  <!-- menu item -->
                  <li class="menu-item mb-1"><a href="/Project/ServletSondage?action=allsondage" ><i class="fa-solid fa-equals"></i>  Sondages</a></li>
                  <li class="menu-item mb-4"><a href="/Project/ServletDemande?action=alldemande&m=0" ><i class="fa-solid fa-equals"></i>  Demandes</a></li>
                  <!-- menu item -->
                  <li class="menu-item "><a href="/Project/ServletLogin?action=logout" target="_blank"><i class="fa-solid fa-right-from-bracket"></i>  Deconnecter</a></li>
                </ul>
                <!-- menu list end -->
              </nav>
              <!-- menu end -->
              <!-- info bar about end -->
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
          <div class="art-top-bg" style="background-image: url(img/bg.jpg)">
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
                  </div>
                  <!-- col end -->
                </div>
                <!-- row end -->
              </div>
              <!-- container end -->
              <!-- container -->
              <div class="container-fluid">
                <!-- row -->
                <div class="row adm-row">
                  <!-- col -->
                  <div class="col-lg-3 col-md-4">
                    <!-- service -->
                    <div class="art-a art-service-icon-box ">
                      <!-- service content -->
                      <div class=" art-service-ib-content1 text-center ">
                          <!-- title -->
                          <h5 class="mb-15">Celebritees</h5>
                          <!-- text -->
                          <div class="mb-4 nombre-perform"><i class="fa-regular fa-user"></i>   <c:out value="${c}" /></div>
                          <!-- button -->
                          <div class="art-buttons-frame"><a href="/Project/ServletCelebrity?action=allceleb" class="art-link art-color-link">Aller</a></div>
                      </div>
                      <!-- service content end -->
                    </div>
                    <!-- service end -->
                  </div>
                  <!-- col end -->
                  <!-- col -->
                  <div class="col-lg-3 col-md-4">
                    <!-- service -->
                    <div class="art-a art-service-icon-box ">
                     <!-- service content -->
                     <div class=" art-service-ib-content1 text-center ">
                        <!-- title -->
                        <h5 class="mb-15">Fan</h5>
                        <!-- text -->
                        <div class="mb-4 nombre-perform"><i class="fa-solid fa-users"></i>   <c:out value="${f}" /></div>
                        <!-- button -->
                        <div class="art-buttons-frame"><a href="/Project/SevletFAN?action=allfan" class="art-link art-color-link">Aller</a></div>
                    </div>
                    <!-- service content end -->
                    </div>
                    <!-- service end -->
                  </div>
                  <!-- col end -->
                  <!--col-->
                  <div class="col-lg-3 col-md-4">
                    <!-- service -->
                    <div class="art-a art-service-icon-box ">
                      <!-- service content -->
                      <div class=" art-service-ib-content1 text-center ">
                        <!-- title -->
                        <h5 class="mb-15">Articles</h5>
                        <!-- text -->
                        <div class="mb-4 nombre-perform"><i class="fa-solid fa-rectangle-list"></i>   <c:out value="${m+t}" /></div>
                        <!-- button -->
                        <div class="art-buttons-frame"><a href="/Project/ServletArticle?action=allarticle" class="art-link art-color-link">Aller</a></div>
                    </div>
                    <!-- service content end -->
                    </div>
                    <!-- service end -->
                  </div>
                  <!--col end-->
                  <!--col-->
                  <div class="col-lg-3 col-md-4">
                    <!-- service -->
                    <div class="art-a art-service-icon-box ">
                     <!-- service content -->
                     <div class=" art-service-ib-content1 text-center ">
                        <!-- title -->
                        <h5 class="mb-15">Sondages</h5>
                        <!-- text -->
                        <div class="mb-4 nombre-perform"><i class="fa-solid fa-equals"></i>   <c:out value="${s}" /></div>
                        <!-- button -->
                        <div class="art-buttons-frame"><a href="/Project/ServletSondage?action=allsondage" class="art-link art-color-link">Aller</a></div>
                    </div>
                    <!-- service content end -->
                    </div>
                    <!-- service end -->
                  </div>
                  <!--col end-->
                </div>
                <!-- row end -->
              </div>
              <!-- container end -->
              <!--conatiner-->
              <div class="container-fluid mt-4 text-center">
                <!-- row -->
                 <h4 class="text-info">Dashboard</h4>
                <div class="row text-center">
                <div class="col-12">
                 <img src="https://d85wutc1n854v.cloudfront.net/live/products/icons/WB0JL13X7.jpg?v=1.2" class="img-fluid" alt="..." width="100%">
                </div> 
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