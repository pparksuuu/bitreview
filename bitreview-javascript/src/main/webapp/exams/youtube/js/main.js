var pageCounter = 1;
var btn = document.getElementById("btn");
var animalContainer = document.getElementById("animal-info");

btn.addEventListener("click", function() {
  var ourRequest = new XMLHttpRequest();
  // now we just need to tell our variable to actually do something

  ourRequest.open('GET', 'https://learnwebcode.github.io/json-example/animals-' + pageCounter + '.json');
  // this is our chance to say what we want to do.
  // First argument : whether we want to send data('POST') or receive data('GET')
  // Second argument : the URL that we want to talk to
  // ===> Go to this URL and get the JSON data.

  // what should happend once the data is loaded
  ourRequest.onload = function() {
    if (ourRequest.status >= 200 && ourRequest.status < 400) {
      var ourData = JSON.parse(ourRequest.responseText);
      // now we have all of the data within our new variable
      renderHTML(ourData);
    } else {
      console.log("We connected to the server, but it returned an error.")
    }
  };

  ourRequest.onerror = function () {
    console.log("Connection error");
  };

  ourRequest.send();
  pageCounter++;
  if (pageCounter > 3) {
    btn.classList.add("hide-me");
  }
});

// Sold job is to create and add HTML to the page so this way our code stays organized.
function renderHTML(data) { // we can access the JSON data that got pulled in with AJAX
  var htmlString = "";

  for (i = 0; i < data.length; i++) {
    htmlString += "<p>" + data[i].name + " is a " + data[i].species + " that likes to eat ";

    for (ii = 0; ii < data[i].foods.likes.length; ii++) {
      if (ii == 0) {
        htmlString += data[i].foods.likes[ii];
      } else {
        htmlString += " and " + data[i].foods.likes[ii];
      }
    }

    htmlString += " and dislikes ";

    for (ii = 0; ii < data[i].foods.dislikes.length; ii++) {
      if (ii == 0) {
        htmlString += data[i].foods.dislikes[ii];
      } else {
        htmlString += " and " + data[i].foods.dislikes[ii];
      }
    }

    htmlString += ".</p>"
  }

  animalContainer.insertAdjacentHTML('beforeend', htmlString);
}
