<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>GoodsWarehouse</title>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>

    <#--Header-->
    <nav class="nav">
        <a href="/" class="logo_text">GoodsWarehouse</a>
        <div class="right_nav">
            <ul class="mnu_top">
                <li><a href="/products" class="down">Goods</a>
                    <ul class="mnu_sub">
                        <li><a href="/products/new">New good</a></li>
                    </ul>
                </li>
                <li><a href="/productTypes">Goods types</a></li>
                <li><a href="/providers" class="down">Providers</a>
                    <ul class="mnu_sub">
                        <li><a href="/providers/new">New provider</a></li>
                    </ul>
                </li>
                <li><a href="/invoices">Invoices</a></li>
                <li><a href="/productsLists" class="down">Orders</a>
                    <ul class="mnu_sub">
                        <li><a href="/productsLists/new">New order</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </nav>


    <h1 style="font-family: 'Segoe Print'; text-align: center"><i>Detailed information about good</i></h1>

    <#list images as img>
        <img class="image" src="/images/${img.id}"/><br><br>
    </#list>
    <b style="margin-left: 30px; font-size: 18px"><i>Good type: </i></b>${product.type.getName()}<br><br>
    <b style="margin-left: 30px; font-size: 18px"><i>Name: </i></b>${product.title}<br><br>
    <b style="margin-left: 30px; font-size: 18px"><i>Description: </i></b>${product.description}<br><br>
    <b style="margin-left: 30px; font-size: 18px"><i>Price: </i></b>${product.unitPrice} руб.<br><br>
    <b style="margin-left: 30px; font-size: 18px"><i>Provider: </i></b>${product.provider.getName()}<br><br><br><br>

    <div style="text-align: center">
        <a class="a_1" href="/products/${product.id}/edit" >Change good</a>
    </div><p/>

    <form action="/products/delete/${product.id}" method="post">
        <input type="submit" value="Delete good"/>
    </form>
</body>
</html>