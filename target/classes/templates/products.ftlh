<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="/css/style.css">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/css/bootstrap.min.css" rel="stylesheet">

    <title>GoodsWarehouse</title>
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

        <#--<h1><i>Goods</i></h1>-->

    <div class="div_before_table">

        <table class="table table-striped sampleTable">
            <thead>
                <tr>
                    <th>Name</th>
                    <th>Unit price, ₽</th>
                    <th>Additional information</th>
                </tr>
            </thead>
            <#foreach product in products>
                <tr>
                    <td>${product.title}</td>
                    <td>${product.unitPrice}</td>
                    <td><a href="/products/${product.getId()}">More detailed...</a></td>
                </tr>
            </#foreach>
        </table>
    </div>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/js/bootstrap.min.js"></script>
    <script src="/js/fancyTable.js"></script>
    <script type="text/javascript">

        $(document).ready(function() {
            $(".sampleTable").fancyTable({
                /* Column number for initial sorting*/
                /*sortColumn:0,*/
                /* Setting pagination or enabling */
                pagination: true ,
                /* Rows per page kept for display */
                perPage:7 ,
                globalSearch:true
            });

        });
    </script>

</body>
</html>