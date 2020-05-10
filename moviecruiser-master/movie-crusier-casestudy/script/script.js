$(document).ready(function(){
    jQuery.expr[':'].contains = function(a, i, m) {
        return jQuery(a).text().toUpperCase().indexOf(m[3].toUpperCase()) >= 0;
       };
    $("#date").append(new Date().getFullYear());
    if( $('#dateOfLaunch').length )        
    {
        $("#dateOfLaunch").datepicker({
            uiLibrary: "bootstrap4",
            format: "dd/mm/yyyy",
        });
    }
    var movies = $("#movies").html();
    $("#search").keyup(function(){
        $("#movies").html(movies);
        var filter = $(this).val();
        $('.row').find(".card-title:not(:contains(" + filter + "))").parent().parent().parent().remove();
    });
});