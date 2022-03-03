let turl = "http://localhost:8080/com/hightraffic?";
async function fetchTraffic() {
    let res = await fetch(turl);
    let data = await res.json();

    if (res.status == 200) {
        console.log(data);

    } else {
        console.log("something went wrong");
    }

    var labels = data.map(function(e) {
       return e.country;
    });
    var mom = data.map(function(e) {
       return e.sold;
    });;

    var ctx = document.getElementById('canvasThree').getContext('2d');
    var config = {
       type: 'line',
       data: {
          labels: labels,
          datasets: [{
             label: 'Sales',
             data: mom,
             backgroundColor: 'rgba(0, 119, 204, 0.3)'
          }]
       }
    };

    var chart = new Chart(ctx, config);


}

