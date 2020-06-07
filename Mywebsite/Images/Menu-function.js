const Animation = () => {

    const mobile = document.querySelector('.mobile-view');

    const links = document.querySelector('.links');

    mobile.addEventListener('click',()=>{

        links.classList.toggle('active');

    })
}

Animation();