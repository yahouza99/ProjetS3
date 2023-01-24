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
  <title>Sondage_liste</title>
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
              <div class="art-sm-text">yahouza Adamou </div>
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
                  <li class="menu-item mb-1"><a href="/Project/ServletAdmin?action=home"><i class="fa-solid fa-house"></i>  Home</a></li>
                  <!-- menu item -->
                  <li class="menu-item current-menu-item mb-1"><a href="/Project/ServletCelebrity?action=allceleb" ><i class="fa-regular fa-user"></i>   Celebritees</a></li>
                  <!-- menu item -->
                  <li class="menu-item   mb-1" ><a href="/Project/SevletFAN?action=allfan" ><i class="fa-solid fa-users"></i>  Fan</a></li>
                  <!-- menu item -->
                  <li class="menu-item mb-1"><a href="/Project/ServletArticle?action=allarticle"><i class="fa-solid fa-rectangle-list"></i>  Articles</a></li>
                  <!-- menu item -->
                  <li class="menu-item mb-1"><a href="/Project/ServletSondage?action=allsondage" style="color:white;"><i class="fa-solid fa-equals"></i>  Sondages</a></li>
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
        <div class="art-content" style="padding-right: 0px;">
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
           <!-- container -->
          <div class="container-fluid">
                <!-- row -->
                <div class="row justify-content-center ">
                  <!-- col -->
                  <div class="col-lg-12 text-center">
                    <h3 class=" mx-5">Les Sondages</h3>
                  </div>
                  <div class="col-lg-8 text-center my-2">
                   <div class="d-flex flex-row">
                      <input type="email" class="form-control " id="recherche" placeholder="Search" >
                       <a href="/Project/ServletSondage?action=newsondage_t" style="background:white;padding-top:10px; margin-left:4px;" ><h5 class=" mx-5" style="color: #594E83;" >Nouveau.Sondage</h5></a>
                   </div>
                  </div>
                  <!-- col end -->
                </div>
                <!-- row end -->
              </div>
             <!-- container end -->
                           <!-- container -->
          <div class="container-fluid my-2">
                <!-- row -->
                <div class="row justify-content-center ">
                  <!-- col -->
                  <div class="col-lg-6 text-center ">
                    <a href="/Project/ServletSondage?action=allsondage" ><h5 class=" mx-5"  ><i class="fa-solid fa-film"></i> Films & Series</h5></a>
                  </div>
                  <div class="col-lg-6 text-center ">
                   <a href="/Project/ServletSondage?action=allsondage_t"> <h5 class=" mx-5" style="color: #594E83;"><i class="fa-solid fa-music"></i> Titres </h5></a>
                  </div>
                  <!-- col end -->
                </div>
                <!-- row end -->
              </div>
             <!-- container end -->
            <!-- scroll frame -->
            <div id="scrollbar" class="art-scroll-frame">
              <!--conatiner-->
              <div class="container-fluid mt-2">
                <!-- row -->
                <div class="row adm-row">
                    <table class="table">
                        <thead>
                          <tr>
                           <th scope="col">Date du lancement</th>
                            <th scope="col">Article 1</th>
                            <th scope="col">Article 2</th>
                            <th scope="col">Statut</th>
                            <th scope="col">Action</th>
                          </tr>
                        </thead>
                        <tbody>
                         <c:forEach var="sondage" items="${listsondages}"  varStatus="boucle">
                          <tr>
                                    <td>
                                       <c:out value="${sondage.getDate_st()}" />
                                    </tsd>
                                    <td>
                                      <c:forEach var="titre" items="${listtitres}"  varStatus="boucle">
                                        <c:if test="${sondage.getId1()==titre.getIdtitre()}">
                                        <c:out value="${titre.getLabel_titre()}" />
                                        </c:if>
                                      </c:forEach>
                                    </td>
                                    <td>
                                        <c:forEach var="titre2" items="${listtitres}"  varStatus="boucle">
                                        <c:if test="${sondage.getId2()==titre2.getIdtitre()}">
                                        <c:out value="${titre2.getLabel_titre()}" />
                                        </c:if>
                                      </c:forEach>
                                    </td>
                                    <td>
                                      <c:if test="${sondage.getSatut_st()==0}">
                                         <a class="text-danger" href="/Project/ServletSondage?action=updatesondage_t&id=<c:out value='${sondage.getIdsondage_titre()}' />&statu=1"><i class="fa-solid fa-circle-stop"></i></a>
                                      </c:if>
                                      <c:if test="${sondage.getSatut_st()==1}">
                                         <a class="text-success" href="/Project/ServletSondage?action=updatesondage_t&id=<c:out value='${sondage.getIdsondage_titre()}' />&statu=0"><i class="fa-solid fa-check"></i></a>
                                      </c:if>
                                    </td>
                                    <td><a class="text-info" href="/Project/ServletSondage?action=findsondage_t&id=<c:out value='${sondage.getIdsondage_titre()}'/>">
                                       <i class="fa-solid fa-pen"></i></a> 
                                       |<a class="text-danger" href="/Project/ServletSondage?action=deletesondage_t&id=<c:out value='${sondage.getIdsondage_titre()}'/>">
                                       <i class="fa-solid fa-trash-can"></i></a>
                                   </td>
                          </tr>
                         </c:forEach>
                        </tbody>
                      </table>
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