const smartTipsAcc = document.getElementsByClassName("stips-header");

function smartTipsClick(evt) {
  evt.preventDefault();
  this.classList.toggle("active");
  const panel = this.nextElementSibling;
  panel.classList.toggle("content-show");
}

for (let i = 0; i < smartTipsAcc.length; i++) {
  //smartTipsAcc[i].addEventListener('touchstart', smartTipsClick);
smartTipsAcc[i].addEventListener('click', smartTipsClick);
}