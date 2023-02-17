
import { Tooltip, Toast, Popover } from 'bootstrap';
$('[data-bs-toggle="tooltip"]').tooltip()

$(document).ready(function() {
	$(window).scroll(function() {
		// sticky navbar on scroll script
		if (this.scrollY > 20) {
			$('.navbar').addClass("sticky");
		} else {
			$('.navbar').removeClass("sticky");
		}

		// scroll-up button show/hide script
		if (this.scrollY > 500) {
			$('.scroll-up-btn').addClass("show");
		} else {
			$('.scroll-up-btn').removeClass("show");
		}
	});

	// slide-up script
	$('.scroll-up-btn').click(function() {
		$('html').animate({ scrollTop: 0 });
		// removing smooth scroll on slide-up button click
		$('html').css("scrollBehavior", "auto");
	});

	$('.navbar .nav nav-pills li a').click(function() {
		// applying again smooth scroll on menu items click
		$('html').css("scrollBehavior", "smooth");
	});

	// toggle menu/navbar script
	$('.menu-btn').click(function() {
		$('.navbar .nav nav-pills').toggleClass("active");
		$('.menu-btn i').toggleClass("active");
	});

	// typing text animation script
	var typed = new Typed(".typing", {
		strings: ["Developer", "Designer"],
		typeSpeed: 100,
		backSpeed: 60,
		loop: true
	});

	var typed = new Typed(".typing-2", {
		strings: ["Developer", "Designer"],
		typeSpeed: 100,
		backSpeed: 60,
		loop: true
	});

	// owl carousel script
	$('.carousel').owlCarousel({
		margin: 20,
		loop: true,
		autoplay: true,
		autoplayTimeOut: 2000,
		autoplayHoverPause: true,
		responsive: {

		}
	});

});
var acc = document.getElementsByClassName("accordion");
var i;

for (i = 0; i < acc.length; i++) {
  acc[i].addEventListener("click", function() {
    this.classList.toggle("active");
    var panel = this.nextElementSibling;
    if (panel.style.maxHeight) {
      panel.style.maxHeight = null;
    } else {
      panel.style.maxHeight = panel.scrollHeight + "px";
    } 
  });
}


var scrollSpy = new bootstrap.ScrollSpy(document.body, {
  target: '#navbar-example'
})

