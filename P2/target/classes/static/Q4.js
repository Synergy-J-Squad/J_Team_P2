let gturl = "http://localhost:8080/com/salesbyhour?";
async function fetchHour() {
    let res = await fetch(gturl);
    let data = await res.json();

    if (res.status == 200) {
        console.log(data);

    } else {
        console.log("something went wrong");
    }

    var labels = data.map(function(e) {
       return e.hour;
    });
    var mom = data.map(function(e) {
       return e.count;
    });;

    var ctx = document.getElementById('canvasFour').getContext('2d');
    var config = {
       type: 'bar',
       data: {
          labels: labels,
          datasets: [{
             label: 'Hour',
             data: mom,
             backgroundColor: 'rgba(0, 119, 204, 0.3)'
          }]
       }
    };

    var chart = new Chart(ctx, config);

}

