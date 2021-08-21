const divRoot = document.querySelector('#root');
const abb = <h1> Hola </h1>;
const Api_key = 'OBTCETCUBVVUTSSL';


const peticion = fetch(`https://www.alphavantage.co/query?function=TIME_SERIES_DAILY&symbol=fb&apikey=${ Api_key }`);

peticion
	.then( resp =>resp.json())
	.then (datos => {
		const valor = 'Meta Data';
		const jsonString = datos[valor];
		const respuesta = JSON.stringify(jsonString);
		ReactDOM.render(respuesta, divRoot);
		console.log(datos);
		console.log(JSON.stringify(jsonString))
	})
	.catch(console.warn);

	

