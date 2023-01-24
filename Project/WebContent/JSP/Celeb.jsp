<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html lang="en">

<head>
    <meta charset="UTF-8">

    <!-- ===== Mobile viewport optimized ===== -->
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0,maximum-scale=1.0, user-scalable=no">

    <!-- ===== Meta Tags - Description for Search Engine purposes ===== -->
    <meta name="description" content="Movify - Movies, Series & Cinema HTML Template">
    <meta name="keywords" content="movies, series, online streaming, html template, cinema html template">
    <meta name="author" content="GnoDesign">

    <!-- ===== Website Title ===== -->
    <title>Celebritées</title>

    <!-- ===== Favicon & Different size apple touch icons ===== -->
    <link rel="shortcut icon" href="assets/images/favicon.png" type="image/x-icon">
    <link rel="apple-touch-icon" sizes="57x57" href="assets/images/apple-touch-icon-iphone.png">
    <link rel="apple-touch-icon" sizes="76x76" href="assets/images/apple-touch-icon-ipad.png">
    <link rel="apple-touch-icon" sizes="120x120" href="assets/images/apple-touch-icon-iphone-retina.png">
    <link rel="apple-touch-icon" sizes="152x152" href="assets/images/apple-touch-icon-ipad-retina.png">
    <link rel="apple-touch-icon" sizes="167x167" href="assets/images/apple-touch-icon-ipad-pro.png">
    <link rel="apple-touch-icon" sizes="180x180" href="assets/images/apple-touch-icon-iphone-6-plus.png">
    <link rel="icon" sizes="192x192" href="assets/images/icon-hd.png">
    <link rel="icon" sizes="128x128" href="assets/images/icon.png">

    <!-- ===== Google Fonts ===== -->
    <link href="https://fonts.googleapis.com/css?family=Quicksand:300,400,500,700" rel="stylesheet">

    <!-- ===== CSS links ===== -->
    <link rel="stylesheet" type="text/css" href="assets/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="assets/revolution/css/settings.css">
    <link rel="stylesheet" type="text/css" href="assets/revolution/css/layers.css">
    <link rel="stylesheet" type="text/css" href="assets/revolution/css/navigation.css">
    <link rel="stylesheet" type="text/css" href="assets/css/magnific-popup.css">
    <link rel="stylesheet" type="text/css" href="assets/css/jquery.mmenu.css">
    <link rel="stylesheet" type="text/css" href="assets/css/owl.carousel.min.css">

    <link rel="stylesheet" type="text/css" href="assets/css/style.css">
    <link rel="stylesheet" type="text/css" href="assets/css/responsive.css">


    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
	<script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
	<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
<![endif]-->
</head>

<body>


    <!-- =============== START OF PRELOADER =============== -->
    <div class="loading">
        <div class="loading-inner">
            <div class="loading-effect">
                <div class="object"></div>
            </div>
        </div>
    </div>
    <!-- =============== END OF PRELOADER =============== -->



    <!-- =============== START OF RESPONSIVE - MAIN NAV =============== -->
    <nav id="main-mobile-nav"></nav>
    <!-- =============== END OF RESPONSIVE - MAIN NAV =============== -->



    <!-- =============== START OF WRAPPER =============== -->
    <div class="wrapper">


        <!-- =============== START OF HEADER NAVIGATION =============== -->
        <!-- Insert the class "sticky" in the header if you want a sticky header -->
        <header class="header">
            <div class="container-fluid">

                <!-- ====== Start of Navbar ====== -->
                <nav class="navbar navbar-expand-lg">

                    <a class="navbar-brand" href="index.html">
                         <!-- INSERT YOUR LOGO HERE -->
                         <img src="assets/images/logo.svg" alt="logo" width="150" class="logo">
                         <!-- INSERT YOUR WHITE LOGO HERE -->
                         <img src="assets/images/logo-white.png" alt="white logo" width="150" class="logo-white">
                    </a>
                    
                    <!-- Login Button on Responsive -->
                    <a href="#login-register-popup" class="login-mobile-btn popup-with-zoom-anim"><i class="icon-user"></i></a>

                    <button id="mobile-nav-toggler" class="hamburger hamburger--collapse" type="button">
                       <span class="hamburger-box">
                          <span class="hamburger-inner"></span>
                       </span>
                    </button>

                    <!-- ====== Start of #main-nav ====== -->
                    <div class="navbar-collapse" id="main-nav">

                        <!-- ====== Start of Main Menu ====== -->
                        <ul class="navbar-nav mx-auto" id="main-menu">
                            <!-- Menu Item -->
                            <li class="nav-item ">
                                <a class="nav-link " href="/" >Home</a>

                            </li>

                            <!-- Menu Item -->
                            <li class="nav-item ">
                                <a class="nav-link " href="/celeb">Celebrtiy</a>

                               
                            </li>

                            <!-- Menu Item -->
                            <li class="nav-item ">
                                <a class="nav-link " href="/sondage"  >Sondages</a>

                                
                            </li>
                            <!-- Menu Item -->
                            <li class="nav-item ">
                                <a class="nav-link " href="/admin"  >Admin</a>

                        </ul>
                        <!-- ====== End of Main Menu ====== -->


                        <!-- ====== Start of Extra Nav ====== -->
                        <ul class="navbar-nav extra-nav">

                            <!-- Menu Item -->
                            <li class="nav-item m-auto">
                                <a href="#login-register-popup" class="btn btn-main btn-effect login-btn popup-with-zoom-anim">
                                    <i class="icon-user"></i>login
                                </a>
                            </li>
                        </ul>
                        <!-- ====== End of Extra Nav ====== -->

                    </div>
                    <!-- ====== End of #main-nav ====== -->
                </nav>
                <!-- ====== End of Navbar ====== -->

            </div>
        </header>
        <!-- =============== END OF HEADER NAVIGATION =============== -->



        <!-- =============== START OF PAGE HEADER =============== -->
        <section class="page-header overlay-gradient" style="background: url(assets/images/posters/movie-collection.jpg);">
            <div class="container">
                <div class="inner">
                    <h2 class="title">Celebrities Grid</h2>
                    <ol class="breadcrumb">
                        <li><a href="index.html">Home</a></li>
                        <li>Celebrities Grid</li>
                    </ol>
                </div>
            </div>
        </section>
        <!-- =============== END OF PAGE HEADER =============== -->



        <!-- =============== START OF MAIN =============== -->
        <main class="ptb100">
            <div class="container">

                <!-- Start of Celebrities Grid -->
                <div class="row">

                    <!-- Celebrity Grid Item -->
                    <div class="col-lg-4 col-md-6 col-sm-12">
                        <div class="celebrity-grid-1">
                            <div class="celeb-container">

                                <!-- Celebrity Image -->
                                <div class="celebrity-image">
                                    <a href="celebrity-detail.html">
                                        <img src="assets/images/slider/slider3.png" alt="">
                                    </a>
                                </div>

                                <!-- Celebrity Content -->
                                <div class="celebrity-content">
                                    <div class="inner">
                                        <h3 class="title"><a href="celebrity-detail.html">Bryan Doe</a></h3>

                                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
                                    </div>
                                </div>

                            </div>
                        </div>
                    </div>

                    <!-- Celebrity Grid Item -->
                    <div class="col-lg-4 col-md-6 col-sm-12">
                        <div class="celebrity-grid-1">
                            <div class="celeb-container">

                                <!-- Celebrity Image -->
                                <div class="celebrity-image">
                                    <a href="celebrity-detail.html">
                                        <img src="assets/images/celebrities/celebrity2.jpg" alt="">
                                    </a>
                                </div>

                                <!-- Celebrity Content -->
                                <div class="celebrity-content">
                                    <div class="inner">
                                        <h3 class="title"><a href="celebrity-detail.html">Baron Saul</a></h3>

                                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
                                    </div>
                                </div>

                            </div>
                        </div>
                    </div>

                    <!-- Celebrity Grid Item -->
                    <div class="col-lg-4 col-md-6 col-sm-12">
                        <div class="celebrity-grid-1">
                            <div class="celeb-container">

                                <!-- Celebrity Image -->
                                <div class="celebrity-image">
                                    <a href="celebrity-detail.html">
                                        <img src="assets/images/celebrities/celebrity3.jpg" alt="">
                                    </a>
                                </div>

                                <!-- Celebrity Content -->
                                <div class="celebrity-content">
                                    <div class="inner">
                                        <h3 class="title"><a href="celebrity-detail.html">Ewan Actor</a></h3>

                                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
                                    </div>
                                </div>

                            </div>
                        </div>
                    </div>

                    <!-- Celebrity Grid Item -->
                    <div class="col-lg-4 col-md-6 col-sm-12">
                        <div class="celebrity-grid-1">
                            <div class="celeb-container">

                                <!-- Celebrity Image -->
                                <div class="celebrity-image">
                                    <a href="celebrity-detail.html">
                                        <img src="assets/images/celebrities/celebrity4.jpg" alt="">
                                    </a>
                                </div>

                                <!-- Celebrity Content -->
                                <div class="celebrity-content">
                                    <div class="inner">
                                        <h3 class="title"><a href="celebrity-detail.html">Nicole Beet</a></h3>

                                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
                                    </div>
                                </div>

                            </div>
                        </div>
                    </div>

                    <!-- Celebrity Grid Item -->
                    <div class="col-lg-4 col-md-6 col-sm-12">
                        <div class="celebrity-grid-1">
                            <div class="celeb-container">

                                <!-- Celebrity Image -->
                                <div class="celebrity-image">
                                    <a href="celebrity-detail.html">
                                        <img src="assets/images/celebrities/celebrity5.jpg" alt="">
                                    </a>
                                </div>

                                <!-- Celebrity Content -->
                                <div class="celebrity-content">
                                    <div class="inner">
                                        <h3 class="title"><a href="celebrity-detail.html">Norman Cage</a></h3>

                                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
                                    </div>
                                </div>

                            </div>
                        </div>
                    </div>

                    <!-- Celebrity Grid Item -->
                    <div class="col-lg-4 col-md-6 col-sm-12">
                        <div class="celebrity-grid-1">
                            <div class="celeb-container">

                                <!-- Celebrity Image -->
                                <div class="celebrity-image">
                                    <a href="celebrity-detail.html">
                                        <img src="assets/images/celebrities/celebrity6.jpg" alt="">
                                    </a>
                                </div>

                                <!-- Celebrity Content -->
                                <div class="celebrity-content">
                                    <div class="inner">
                                        <h3 class="title"><a href="celebrity-detail.html">Tiffany Smith</a></h3>

                                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
                                    </div>
                                </div>

                            </div>
                        </div>
                    </div>

                </div>
                <!-- End of Celebrities Grid -->



                <!-- Start of Pagination -->
                <div class="row">
                    <div class="col-md-12 col-sm-12">
                        <nav class="pagination">
                            <ul>
                                <li><a href="#" class="current-page">1</a></li>
                                <li><a href="#">2</a></li>
                                <li><a href="#">3</a></li>
                                <li><a href="#"><i class="ti-angle-right"></i></a></li>
                            </ul>
                        </nav>
                    </div>
                </div>
                <!-- End of Pagination -->

            </div>
        </main>
        <!-- =============== END OF MAIN =============== -->



        

    </div>
    <!-- =============== END OF WRAPPER =============== -->




   



   <!-- =============== START OF LOGIN & REGISTER POPUP =============== -->
   <div id="login-register-popup" class="small-dialog zoom-anim-dialog mfp-hide">

    <!-- ===== Start of Signin wrapper ===== -->
    <div class="signin-wrapper">
        <div class="small-dialog-headline">
            <h4 class="text-center">LOGIN</h4>
        </div>


        <div class="small-dialog-content">

            <!-- Start of Login form -->
            <form id="cariera_login" method="post">
                <p class="status"></p>

                <div class="form-group">
                    <label for="username">Login</label>
                    <input type="text" class="form-control" name="login"
                        placeholder="Login" required />
                </div>

                <div class="form-group">
                    <label for="password">Password </label>
                    <input type="password" class="form-control"  name="password"
                        placeholder="Password " required/>
                </div>

                <div class="form-group">
                    <input type="submit" value="Se Connecter" class="btn btn-main btn-effect nomargin" />
                </div>
            </form>
            <!-- End of Login form -->

            <div class="bottom-links">
                <span>
                    pas encore inscrit?
                    <a class="signUpClick" href="#">Sign up</a>
                </span>
            </div>
        </div>

    </div>
    <!-- ===== End of Signin wrapper ===== -->

</div>
<!-- =============== END OF LOGIN & REGISTER POPUP =============== -->



    <!-- ===== Start of Back to Top Button ===== -->
    <div id="backtotop">
        <a href="#"></a>
    </div>
    <!-- ===== End of Back to Top Button ===== -->



    <!-- ===== All Javascript at the bottom of the page for faster page loading ===== -->
    <script src="assets/js/jquery-3.2.1.min.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>
    <script src="assets/js/jquery.ajaxchimp.js"></script>
    <script src="assets/js/jquery.magnific-popup.min.js"></script>
    <script src="assets/js/jquery.mmenu.js"></script>
    <script src="assets/js/jquery.inview.min.js"></script>
    <script src="assets/js/jquery.countTo.min.js"></script>
    <script src="assets/js/jquery.countdown.min.js"></script>
    <script src="assets/js/owl.carousel.min.js"></script>
    <script src="assets/js/imagesloaded.pkgd.min.js"></script>
    <script src="assets/js/isotope.pkgd.min.js"></script>
    <script src="assets/js/headroom.js"></script>
    <script src="assets/js/custom.js"></script>

    <!-- ===== Slider Revolution core JavaScript files ===== -->
    <script type="text/javascript" src="assets/revolution/js/jquery.themepunch.tools.min.js"></script>
    <script type="text/javascript" src="assets/revolution/js/jquery.themepunch.revolution.min.js"></script>

    <!-- ===== Slider Revolution extension scripts ===== -->
    <script type="text/javascript" src="assets/revolution/js/extensions/revolution.extension.actions.min.js"></script>
    <script type="text/javascript" src="assets/revolution/js/extensions/revolution.extension.carousel.min.js"></script>
    <script type="text/javascript" src="assets/revolution/js/extensions/revolution.extension.kenburn.min.js"></script>
    <script type="text/javascript" src="assets/revolution/js/extensions/revolution.extension.layeranimation.min.js"></script>
    <script type="text/javascript" src="assets/revolution/js/extensions/revolution.extension.migration.min.js"></script>
    <script type="text/javascript" src="assets/revolution/js/extensions/revolution.extension.navigation.min.js"></script>
    <script type="text/javascript" src="assets/revolution/js/extensions/revolution.extension.parallax.min.js"></script>
    <script type="text/javascript" src="assets/revolution/js/extensions/revolution.extension.slideanims.min.js"></script>
    <script type="text/javascript" src="assets/revolution/js/extensions/revolution.extension.video.min.js"></script>

</body>

</html>
