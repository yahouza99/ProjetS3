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
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css"
        integrity="sha512-MV7K8+y+gLIBoVD59lQIYicR65iaqukzvf/nwasF0nqhPay5w/9lJmVM2hMDcnK1OnMGCdVK+iQrJ7lzPJQd1w=="
        crossorigin="anonymous" referrerpolicy="no-referrer" />
    <!-- main css -->
    <link rel="stylesheet" href="/Project/CSS/style1.css">

    <title>Celeb Page</title>
</head>

<body>
    <!-- app -->

    <div class="art-app">
        <!-- mobile top bar -->

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

                            <!-- info bar button end -->
                        </div>
                        <!-- info bar header end -->
                        <!-- info bar header -->

                        <!-- info bar header end -->
                        <!-- scroll frame -->
                        <div id="scrollbar2" class="art-scroll-frame">
                            <!-- info bar about -->
                            <div class="art-table p-15-15">
                                <!-- about text -->

                            </div>
                            <!-- info bar about end -->
                            <!-- divider -->

                            <!-- divider -->
                            <!-- hard skills -->

                        </div>
                        <!-- scroll frame end -->
                    </div>
                    <!-- menu bar frame end -->
                </div>
                <!-- info bar end -->
                <!-- content -->
                <div class="art-content">
                    <!-- curtain -->
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
                                        <div class="container">
                                            <div class="profile-card">
                                                <div class="profile-header"><!-- profile header section -->
                                                    <div class="main-profile">
                                                        <div class="profile-image"><img src="/Project/CSS/img/profile-image.webp" alt="profile" /></div>
                                                        <div class="profile-names">
                                                            <h1 class="username">${celeb.getPrenom()} ${celeb.getNom()}</h1>
                                                            <strong class="page-title"> ${celeb.getNationalite()} actress</strong>
                                                        </div>
                                                    </div>
                                                </div>

                                                <div class="profile-body"><!-- profile body section -->
                                                    <div class="profile-actions">
                                                        <a href="fanrequest.html"><button class="follow">Les Demandes
                                                            </button></a>
                                                        <a href="fanrequest.html"><button class="message">check
                                                                responses</button></a>

                                                        <section class="bio">
                                                            <div class="bio-header">
                                                                <i class="fa fa-info-circle"></i>
                                                                Bio
                                                            </div>
                                                            <p class="bio-text">
                                                                Lorem ipsum dolor, sit amet consectetur adipisicing
                                                                elit.
                                                            </p>
                                                        </section>
                                                    </div>

                                                    <div class="account-info">
                                                        <div class="data">
                                                            <div class="important-data">
                                                                <section class="data-item">
                                                                    <h3 class="value">88</h3>
                                                                    <small class="title">Movies</small>
                                                                </section>
                                                                <section class="data-item">
                                                                    <h3 class="value">20</h3>
                                                                    <small class="title">Demandes</small>
                                                                </section>
                                                                </section>
                                                                <section class="data-item">
                                                                    <h3 class="value">5</h3>
                                                                    <small class="title">Reponses</small>
                                                                </section>
                                                            </div>
                                                        </div>

                                                        <div class="social-media">
                                                            <span>Mes Reseaux sociaux:</span>
                                                            <a href="" class="media-link"><i
                                                                    class="fab fa-facebook-square"></i></a>
                                                            <a href="https://twitter.com/MammadSahragard"
                                                                class="media-link"><i
                                                                    class="fab fa-twitter-square"></i></a>
                                                            <a href="https://www.linkedin.com/in/mohammadsahragard/"
                                                                class="media-link"><i class="fab fa-linkedin"></i></a>
                                                            <a href="https://www.instagram.com/mammad.sahragard/"
                                                                class="media-link"><i
                                                                    class="fab fa-instagram-square"></i></a>
                                                            <a href="https://github.com/MohammadSahragard"
                                                                class="media-link"><i
                                                                    class="fab fa-github-square"></i></a>
                                                        </div>

                                                        <div class="last-post">
                                                            <div class="post-cover">
                                                                <span class="last-badge">Last Post</span>
                                                            </div>
                                                            <h3 class="post-title">3D layer</h3>
                                                            <button class="post-CTA">View</button>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>

                                        </div>
                                        <!-- banner end -->
                                    </div>
                                    <!-- col end -->
                                </div>
                                <!-- row end -->
                            </div>
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
                                    <li class="menu-item current-menu-item"><a href="/home.html">profile</a></li>
                                    <!-- menu item -->
                                    <li class="menu-item"> <a href="Movies.html">Works</a></li>
                                    <!-- menu item -->
                                    <li class="menu-item"> <a href="/Music.html">Fan requests</a></li>

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