let mosturl = "http://localhost:8080/com/mostpop?";
async function fetchMost() {
    let res = await fetch(mosturl);
    let data = await res.json();

    if (res.status == 200) {
        console.log(data);

    } else {
        console.log("something went wrong");
    }

    var labels = data.map(function(e) {
       return e.product_name;
    });
    var mom = data.map(function(e) {
       return e.month;
    });;
       var bob = data.map(function(e) {
           return e.months;
        });;

    var ctx = document.getElementById('canvasTwo').getContext('2d');
    var config = {
       type: 'bar',
       data: {
          labels: labels,
          datasets: [{
             label: 'Product',
             data: mom,
             backgroundColor: 'rgba(0, 119, 204, 0.3)'
          }]
       }
    };

    var chart = new Chart(ctx, config);


}

