import 'bootstrap/dist/css/bootstrap.min.css';
import Home from './pages/Home'
import MovieList from './pages/MovieList'
import Login from './pages/Login'
import { BrowserRouter, Route, Routes } from 'react-router-dom';

function AppRoutes() {
  return (
    <div>
      <BrowserRouter>
        <Routes>
          <Route path='/' element={<Home />} />
          <Route path='/movielist' element={<MovieList />} />
          <Route path='/login' element={<Login />} />
          <Route path='*' element={<div>Nao faz nada</div>} />
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default AppRoutes;
