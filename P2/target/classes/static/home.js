var chart = new Chart('myChart', {
  type: 'horizontalBar',
  data: {
    labels: ['A', 'B', 'C'],
    datasets: [
      {
        data: [10, 20, 30]
      }
    ]
  }
});

let userurl = "http://localhost:8080/com/salesbyhour?";
let res = await fetch(userurl);
    let data = await res.json();
var lchart = anychart.fromJson(data);

// draw chart
lchart.draw();