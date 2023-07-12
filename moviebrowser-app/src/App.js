import Card from './components/Card';
import TopMenuBar from './components/TopMenuBar';
import "./index"

function App() {
  return (
    <div>
      <TopMenuBar />
      <Card movieName="Dark" genre="Science Fiction" rating="9.5" />
    </div>
  );
}

export default App;
