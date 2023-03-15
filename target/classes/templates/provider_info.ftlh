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


    <h1 style="font-family: 'Segoe Print'; text-align: center"><i>Detailed information about provider</i></h1>

    <b style="margin-left: 30px; font-size: 18px"><i>Name: </i></b>${provider.name}<br><br>
    <b style="margin-left: 30px; font-size: 18px"><i>Address: </i></b>${provider.address}<br><br>
    <b style="margin-left: 30px; font-size: 18px"><i>Phone number: </i></b>${provider.phoneNumber}<br><br><br><br>

    <div style="text-align: center">
        <a class="a_1" href="/providers/${provider.id}/edit" >Change provider</a>
    </div>
    <p/>
    <form action="/providers/delete/${provider.id}" method="post">
        <input type="submit" value="Delete provider"/>
    </form>

</body>
</html>