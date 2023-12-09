var Grid = tui.Grid;

const grid = new Grid({
  el: document.getElementById("grid"),
  columns: [
    {
      header: "카드묶음 번호",
      name: "id",
    },
    {
      header: "카드묶음 이름",
      name: "name",
    },
  ],
});

var httpRequest = new XMLHttpRequest();
httpRequest.open(
  "GET",
  "http://ec2-54-210-76-47.compute-1.amazonaws.com:8080/card-package"
);
httpRequest.responseType = "json";

httpRequest.onreadystatechange = () => {
  if (httpRequest.readyState === XMLHttpRequest.DONE) {
    if (httpRequest.status === 200) {
      var result = httpRequest.response;

      grid.resetData(result);
    } else {
      alert("Request Error!");
    }
  }
};

httpRequest.send();
