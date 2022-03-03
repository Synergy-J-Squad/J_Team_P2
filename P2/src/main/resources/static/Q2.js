function getQuestionTwo(url,methods) {




    let xhr = new XMLHttpRequest();

    xhr.onreadystatechange = receiveData;

    xhr.open(methods, url, true)
    xhr.send();

    function receiveData() {

        if (xhr.readyState == 4 && xhr.status == 200) {
            let x = xhr.responseText;

             chartInfo = JSON.parse(x);

             createChart(chartInfo);
            }
            

        }
    }

function createChart(chartInfo){
    barHeight=[];
    barLabels=[];
    for(i in chartInfo){
        let product=chartInfo[i]['product_name']
        barLabels.push(product);
        barHeight.push(chartInfo[i]['count'])

    }
    console.log(barLabels)
    console.log(barHeight)

    

    let secondChart = document.getElementById('canvasTwo').getContext('2d');
    
    
    
    let twoChart= new Chart(secondChart,{
    type:'bar',
    data:{
        labels:barLabels,
        datasets:[{
            label:'Product',
            backgroundColor: ["#F26925", "#474C55","#474C55"],
            data:
            barHeight
            

}]
},
options:{
plugins: {
title: {
display: true,
text: ``
    }}
}
})
}
