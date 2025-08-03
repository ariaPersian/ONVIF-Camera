import SitecCameraScheduler.scheduler as scheduler


def test_main_outputs_start_message(capsys):
    """Ensure main prints the startup message."""
    scheduler.main()
    captured = capsys.readouterr()
    assert captured.out.strip() == "SitecCameraScheduler is starting..."
