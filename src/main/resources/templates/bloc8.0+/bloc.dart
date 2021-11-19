import 'package:bloc/bloc.dart';

import 'event.dart';
import 'state.dart';

class $nameBloc extends Bloc<$nameEvent, $nameState> {
  $nameBloc() : super($nameState().init()) {
    on<InitEvent>(_init);
  }

  void _init(InitEvent event, Emitter<$nameState> emit) async {
    emit(state.clone());
  }
}
