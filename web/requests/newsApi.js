async function getNews() {
  const req = await fetch(
    "https://newsdata.io/api/1/news?apikey=pub_55432249dc5fc5f8481b0e1fc3423ae02f6e6&q=Futebol"
  );
  const data = await req.json();
  console.log(navigator.geolocation.getCurrentPosition());
}

getNews();
