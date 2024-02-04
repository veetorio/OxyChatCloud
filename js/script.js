const links = Object.values(document.getElementsByClassName('links'))


links.forEach(link => {
    link.addEventListener('click', event => {
        const id = event.target.id
        switch(id){
            case 'link1' :
                open('https://github.com/veetorio')
                break
            case 'link2' :
                open('https://www.linkedin.com/in/ettore-vitorio-b38135280/')
                break
            case 'link3' :
                open('https://www.instagram.com/ettorevit_/') 
                break
        }
    })
})






