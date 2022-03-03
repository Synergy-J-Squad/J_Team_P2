function getQuestionFour(url,methods) {




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
        let country=chartInfo[i]['country']
        barLabels.push(country);
        barHeight.push(chartInfo[i]['product_category'])

    }
    console.log(barLabels)
    console.log(barHeight)

    

    let fourthChart=document.getElementById('fourthCanvas').getContext('2d');
    
    let fourChart= new Chart(fourthChart,{
    type:'bar',
    data:{
        labels:barLabels,
        datasets:[{
            label:'Country',
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
});
}