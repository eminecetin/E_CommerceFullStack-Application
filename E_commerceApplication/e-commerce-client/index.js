const productsTitle=document.getElementById("productsTitle");
const  productsContainer=document.getElementById("productsContainer");

const endPoint="https://fakestoreapi.com/products"


//fetch(endPoind)
  //  .then(res=>res.json())
    //.then(data=>console.log(data));


    async function fetchProducts() {
        const res = await fetch(endPoint);
        const data = await res.json();
        console.log(data);
        
        productsContainer.innerHTML = data.map(product => {
            return `
                <div class="product">
                    <img class="product-img" src=${product.image}>
                    <h3 class="product-title">${product.title}</h3>
                    <div class="product-descriptions">
                        <span class="product-category">${product.category}</span>
                        <span class="product-price">$${product.price}</span>
                    </div>
                </div>
            `;
        }) // Dizi öğelerini birleştiriyoruz
    }
    

fetchProducts();
