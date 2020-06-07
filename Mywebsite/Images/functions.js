const PortfolioItems = document.querySelectorAll('.items')

PortfolioItems.forEach(item => {

    item.addEventListener('mouseover', () => {

        item.childNodes[1].classList.add('image-darken');

    })
})

PortfolioItems.forEach(item => {

    item.addEventListener('mouseout', () => {

        item.childNodes[1].classList.remove('image-darken');

    })
})

