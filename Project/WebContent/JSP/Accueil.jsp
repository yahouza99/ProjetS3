<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
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
    <title>FAN WORLD</title>

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
    <link rel="stylesheet" type="text/css" href="assets/css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="assets/css/style.css">
    <link rel="stylesheet" type="text/css" href="assets/css/responsive.css">

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
        <header class="header header-fixed header-transparent text-white">
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
                    <a href="#login-register-popup" class="login-mobile-btn popup-with-zoom-anim"><i
                            class="icon-user"></i></a>

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
                                <a href="#login-register-popup"
                                    class="btn btn-main btn-effect login-btn popup-with-zoom-anim">
                                    <i class="fa fa-search"></i>login
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




        <!-- =============== START OF SLIDER REVOLUTION SECTION =============== -->
        <section id="slider" class="full-slider">
            <div class="rev-slider-wrapper fullscreen-container overlay-gradient">
                <div id="fullscreen-slider" class="rev_slider fullscreenbanner" style="display:none"
                    data-version="5.4.1">
                    <ul>

                        <!-- ===== SLIDE NR. 1 ===== -->
                        <li data-transition="fade">
                            <!-- MAIN IMAGE -->
                            <img src="assets/images/slider/slider1.webp" alt="Image" title="slider-bg"
                                data-bgposition="center center" data-bgfit="cover" data-bgrepeat="no-repeat"
                                data-bgparallax="10" class="rev-slidebg" data-no-retina="">
                            <!-- LAYER NR. 1 -->
                            <div class="tp-caption tp-resizeme" data-x="center" data-hoffset="" data-y="middle"
                                data-voffset="['-30','-30','-30','-30']" data-responsive_offset="on"
                                data-fontsize="['60','50','40','30']" data-lineheight="['60','50','40','30']"
                                data-whitespace="nowrap"
                                data-frames='[{"delay":1000,"speed":2000,"frame":"0","from":"y:[100%];z:0;rX:0deg;rY:0;rZ:0;sX:1;sY:1;skX:0;skY:0;opacity:0;","mask":"x:0px;y:[100%];s:inherit;e:inherit;","to":"o:1;","ease":"Power2.easeInOut"},{"delay":"wait","speed":500,"frame":"999","to":"auto:auto;","ease":"Power3.easeInOut"}]'
                                style="z-index: 5; color: #fff; font-weight: 900;">All YOUR FAVORITE ARTS
                                IN ONE PLACE
                            </div>
                        </li>

                        <!-- ===== SLIDE NR. 2 ===== -->
                        <li data-transition="fade" data-slotamount="7" data-easein="default" data-easeout="default"
                            data-masterspeed="2000">
                            <!-- MAIN IMAGE -->
                            <img src="assets/images/slider/slider3.jpg" alt="Image" title="slider-bg"
                                data-bgposition="center top" data-bgfit="cover" data-bgrepeat="no-repeat"
                                data-bgparallax="10" class="rev-slidebg" data-no-retina="">
                            <!-- LAYER NR. 1 -->
                            <div class="tp-caption tp-resizeme" data-x="center" data-hoffset="" data-y="middle"
                                data-voffset="['-30','-30','-30','-30']" data-responsive_offset="on"
                                data-fontsize="['60','50','40','30']" data-lineheight="['60','50','40','30']"
                                data-whitespace="nowrap"
                                data-frames='[{"delay":1000,"speed":2000,"frame":"0","from":"y:[100%];z:0;rX:0deg;rY:0;rZ:0;sX:1;sY:1;skX:0;skY:0;opacity:0;","mask":"x:0px;y:[100%];s:inherit;e:inherit;","to":"o:1;","ease":"Power2.easeInOut"},{"delay":"wait","speed":500,"frame":"999","to":"auto:auto;","ease":"Power3.easeInOut"}]'
                                style="z-index: 3; color: #fff; font-weight: 900;"> CONNECT<br> WITH <br>YOUR<br>
                                FAVORITE<br>
                                CELEB
                            </div>
                        </li>

                        <!-- ===== SLIDE NR. 3 ===== -->
                        <li data-transition="fade" data-slotamount="7" data-easein="default" data-easeout="default"
                            data-masterspeed="2000">
                            <!-- MAIN IMAGE -->
                            <img src="assets/images/slider/slider2.png" alt="Image" data-bgposition="center top"
                                data-bgfit="cover" data-bgrepeat="no-repeat" data-bgparallax="3" class="rev-slidebg"
                                data-no-retina>
                            <!-- LAYER NR. 1 -->
                            <div class="tp-caption tp-resizeme" data-x="center" data-hoffset="" data-y="middle"
                                data-voffset="['-30','-30','-30','-30']" data-responsive_offset="on"
                                data-fontsize="['60','50','40','30']" data-lineheight="['60','50','40','30']"
                                data-whitespace="nowrap"
                                data-frames='[{"delay":1000,"speed":2000,"frame":"0","from":"y:[100%];z:0;rX:0deg;rY:0;rZ:0;sX:1;sY:1;skX:0;skY:0;opacity:0;","mask":"x:0px;y:[100%];s:inherit;e:inherit;","to":"o:1;","ease":"Power2.easeInOut"},{"delay":"wait","speed":500,"frame":"999","to":"auto:auto;","ease":"Power3.easeInOut"}]'
                                style="z-index: 5; color: #fff; font-weight: 900;"> REQUEST A PERSONALIZED CONTENT
                            </div>
                        </li>

                    </ul>
                </div>
            </div>
            <!-- ===== END OF REV SLIDER WRAPPER ===== -->


          
        </section>
        <!-- =============== START OF SLIDER REVOLUTION SECTION =============== -->
        <!-- =============== END OF COUNTER SECTION =============== -->
        <section class="counter bg-main-gradient ptb50 text-center">
            <div class="container">
                <div class="row">

                    <!-- 1st Count up item -->
                    <div class="col-md-4 col-sm-12">
                        <span class="counter-item" data-from="0" data-to="964">0</span>
                        <h4>Celebrtiy</h4>
                    </div>

                    <!-- 2nd Count up item -->
                    <div class="col-md-4 col-sm-12">
                        <span class="counter-item" data-from="0" data-to="743">0</span>
                        <h4>Sondages</h4>
                    </div>

                    <!-- 3rd Count up item -->
                    <div class="col-md-4 col-sm-12">
                        <span class="counter-item" data-from="0" data-to="1207">0</span>
                        <h4>Articles</h4>
                    </div>

                </div>
            </div>
        </section>
        <!-- =============== END OF COUNTER SECTION =============== -->

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
        <a href="#" ><i class="fa-solid fa-up"></i></a>
    </div>
   
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

    
    <script type="text/javascript" src="assets/revolution/js/jquery.themepunch.tools.min.js"></script>
    <script type="text/javascript" src="assets/revolution/js/jquery.themepunch.revolution.min.js"></script>

   
    <script type="text/javascript" src="assets/revolution/js/extensions/revolution.extension.actions.min.js"></script>
    <script type="text/javascript" src="assets/revolution/js/extensions/revolution.extension.carousel.min.js"></script>
    <script type="text/javascript" src="assets/revolution/js/extensions/revolution.extension.kenburn.min.js"></script>
    <script type="text/javascript"
        src="assets/revolution/js/extensions/revolution.extension.layeranimation.min.js"></script>
    <script type="text/javascript" src="assets/revolution/js/extensions/revolution.extension.migration.min.js"></script>
    <script type="text/javascript"
        src="assets/revolution/js/extensions/revolution.extension.navigation.min.js"></script>
    <script type="text/javascript" src="assets/revolution/js/extensions/revolution.extension.parallax.min.js"></script>
    <script type="text/javascript"
        src="assets/revolution/js/extensions/revolution.extension.slideanims.min.js"></script>
    <script type="text/javascript" src="assets/revolution/js/extensions/revolution.extension.video.min.js"></script>

</body>

</html>
