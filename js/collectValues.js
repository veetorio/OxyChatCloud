const btn = document.querySelector('button')
const chat = document.getElementById('chat')
let id = 0
btn.addEventListener('click', () => {
    const comment = String(document.querySelector('textarea').value)
    const commentBody = document.createElement('div')
    const commentProfile = document.createElement('span')
    const commentText = document.createElement('p')
    commentProfile.setAttribute('class','profile')
    commentBody.setAttribute('class','mensagem')
    commentText.textContent = comment
    commentProfile.textContent = 'annonymous'
    commentBody.style.marginTop = '5%'
    commentBody.append(commentProfile,commentText)

    if(id % 2 !== 0){
        chat.append(commentBody)
        commentBody.style.marginLeft = 'auto'
    }else{
        chat.append(commentBody)
    }
    id++

 
    
})
