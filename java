fetch('shibebucks.md')
    .then(response => response.text())
    .then(text => {
        document.getElementById('content').innerHTML = marked.parse(text);
    })
    .catch(error => {
        document.getElementById('content').innerHTML = "<p>Sorry, we couldn't load the whitepaper.</p>";
    });
