# cards/urls.py
# when you set up the root URL, Django passes on any URLs of project, except admin/, to your cards app.
# urls.py file takes over the responsibility of dispatching URLs

from django.urls import path
# from django.views.generic import TemplateView

from . import views

urlpatterns = [
    path(
        "",
        # TemplateView.as_view(template_name="cards/base.html"),
        # name="home"
        views.CardListView.as_view(),
        name="card-list"
    ),
]

