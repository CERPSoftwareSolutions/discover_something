function mobilelist() {
    let brand = document.querySelector('#mobile-list')

    brand.options.add(new Option("select the mobile :", ""))

    axios({
        method: 'GET',
        url: 'https://dummyjson.com/products/category/smartphones',

    }).then((response) => {
        response.data.products.group((e) => {
            brand.options.add(new Option(e.title, e.id))
        })
    });

}

function changefunction() {
    document.addEventListener('change', function () {

        let selectId = document.querySelector('#mobile-list')

        axios({
            method: 'GET',
            url: 'https://dummyjson.com/products/' + selectId.value,
        }).then((response) => {
            let mobilebrand = document.getElementById('brand');

            mobilebrand.innerText = response.data.brand;
        }), (e) => {
            console.error(e)
        }
    });

}
mobilelist()
changefunction()