const Animation = () => {

    const mobile = document.querySelector('.mobile-view');

    const links = document.querySelector('.links');

    const mobilelinks= document.querySelectorAll('.links li');

    //toggle Links

    mobile.addEventListener('click',()=>{

        links.classList.toggle('active');

        //Mobile Links Appears

        mobilelinks.forEach((links, indexes) => {

            if (links.style.animation) {

                links.style.animation = "";

            }
            else {

                links.style.animation = `linksFaded 0.5s ease forwards ${indexes / 5 + 1.2}s`;

            }

        });

    });

    




}

Animation();