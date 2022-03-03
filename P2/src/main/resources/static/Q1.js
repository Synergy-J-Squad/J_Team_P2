let topurl = "http://localhost:8080/com/topsellingcategory?";
async function fetchTop() {
    let res = await fetch(topurl);
    let data = await res.json();

    if (res.status == 200) {
        console.log(data);

    } else {
        console.log("something went wrong");
    }

    var labels = data.map(function(e) {
       return e.product_category;
    });
    var mom = data.map(function(e) {
       return e.qty;
    });;

    var ctx = document.getElementById('canvasOne').getContext('2d');
    var config = {
       type: 'bar',
       data: {
          labels: labels,
          datasets: [{
             label: 'Quantity',
             data: mom,
             backgroundColor: 'rgba(0, 119, 204, 0.3)'
          }]
       }
    };

    var chart = new Chart(ctx, config);


}
